/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.controllers;

import com.BTS.converter.entities.ClientPartner;
import com.BTS.converter.entities.Parameter;
import com.BTS.converter.entities.CorporateType;
import com.BTS.converter.services.ClientPartnerService;
import com.BTS.converter.services.TypeService;
import com.BTS.converter.services.ParameterService;
import com.BTS.converter.tools.Methods;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    @Autowired
    HttpServletRequest request;

    Methods methods = new Methods();

    @RequestMapping("/clientPartner")
    public String getAll(Model model, ClientPartner partner) {
        model.addAttribute("clients", clientService.getAll());
        model.addAttribute("types", typeService.getAll());
        model.addAttribute("params", paramService.getAll());
        return "client";
    }

    @PostMapping("/clientSave")
    public String save(Model model, @Valid ClientPartner clientPartner, BindingResult bindingResult, RedirectAttributes redirectAttributes, CorporateType type) {
        if (bindingResult.hasErrors()) {
            redirectAttributes.addFlashAttribute("status", "berhasil disimpan");
        }
        String name = request.getParameter("name");
        String tipe = request.getParameter("type");
        clientPartner.setId(tipe+'_'+methods.id_for_client(name));
        clientService.save(clientPartner);
        redirectAttributes.addFlashAttribute("status", "gagal disimpan");
        return "redirect:/clientPartner";
    }
}

