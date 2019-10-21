/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.controllers;

import com.BTS.converter.entities.ClientPartner;
import com.BTS.converter.entities.Parameter;
import com.BTS.converter.entities.Type;
import com.BTS.converter.services.ClientPartnerService;
import com.BTS.converter.services.TypeService;
import com.BTS.converter.services.ParameterService;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Reza
 */
@Controller
public class ClientPartnerController {
    @Autowired
    ClientPartnerService clientService;
    
    @Autowired
    TypeService typeService;
    
    @Autowired
    ParameterService paramService;
        
    @RequestMapping("/clientPartner")
    public String getAll(Model model, ClientPartner partner){
        model.addAttribute("clients",clientService.getAll());
        model.addAttribute("types",typeService.getAll());
        model.addAttribute("params",paramService.getAll());
        
        return "###";
    }
    
    @PostMapping("/clientSave")
    public String save(Model model,@Valid ClientPartner clientPartner,BindingResult bindingResult){
        if(bindingResult.hasErrors()){
        model.addAttribute("clients",clientService.getAll());
        model.addAttribute("types",typeService.getAll());
        model.addAttribute("params",paramService.getAll());
        
//        model.addAttribute(model);
        }
        
        model.addAttribute("clients",clientService.getAll());
        model.addAttribute("types",typeService.getAll());
        model.addAttribute("params",paramService.getAll());
        
        paramService.save(saveParam(clientPartner.getParameter().getId()));
        clientService.save(clientPartner);
        
        return "redirect:/clientPartner";
    }
    
    public Parameter saveParam(int id){
        Parameter param;
        ClientPartner client;
        client = new ClientPartner();
        param = new Parameter();
        
        param.setId(id);
        client.setParameter(param);
        
        return param;
    }
}
