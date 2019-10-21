/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.controllers;

import com.BTS.converter.entities.DetailData;
import com.BTS.converter.entities.Parameter;
import com.BTS.converter.entities.Type;
import com.BTS.converter.services.ParameterService;
import com.BTS.converter.services.TypeService;
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
public class TypeController {
    @Autowired
    TypeService typeService;
    
    @RequestMapping("/type")
    public String getAll(Model model, DetailData detaildata) {
        model.addAttribute("types", typeService.getAll());

        return "###";
    }

    @PostMapping("/typeSave")
    public String save(Model model, @Valid Type type, BindingResult bindingResult) {
        if (bindingResult.hasErrors()) {
            model.addAttribute("types", typeService.getAll());
        }

        model.addAttribute("types", typeService.getAll());
        
        typeService.save(type);
        return "redirect:/detaildata";
    }
}
