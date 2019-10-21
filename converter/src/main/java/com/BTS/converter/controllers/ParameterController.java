/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.controllers;

import com.BTS.converter.entities.DetailData;
import com.BTS.converter.entities.Parameter;
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
public class ParameterController {
    @Autowired
    ParameterService paramService;
    
    @RequestMapping("/parameter")
    public String getAll(Model model, DetailData detaildata) {
        model.addAttribute("parameters", paramService.getAll());

        return "###";
    }

    @PostMapping("/paramSave")
    public String save(Model model, @Valid Parameter parameter, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("parameters", paramService.getAll());
        }

        model.addAttribute("parameters", paramService.getAll());
        
        paramService.save(parameter);
        return "redirect:/parameter";
    }
}
