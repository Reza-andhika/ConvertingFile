/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.controllers;

import com.BTS.converter.entities.DetailData;
import com.BTS.converter.entities.Parameter;
import com.BTS.converter.services.ParameterService;
import com.BTS.converter.tools.Methods;
import static com.sun.corba.se.spi.presentation.rmi.StubAdapter.request;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import javax.servlet.http.HttpServletRequest;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 *
 * @author Reza
 */
@Controller
public class ParameterController {
    @Autowired
    ParameterService paramService;
    
    @Autowired
    HttpServletRequest request;
    
    Methods method;
    
    @RequestMapping("/parameter")
    public String getAll(Model model, DetailData detaildata) {
        model.addAttribute("parameters", paramService.getAll());

        return "###";
    }

    @PostMapping("/paramSave")
    public String save(Model model, BindingResult bindingResult) {
        String simbol = request.getParameter("###");
        
        if (bindingResult.hasErrors()) {
            model.addAttribute("parameters", paramService.getAll());
        }

        model.addAttribute("parameters", paramService.getAll());
        
        method.saveParam(simbol);
        return "redirect:/parameter";
    }
}
