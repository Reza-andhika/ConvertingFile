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
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

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

    Methods methods = new Methods();


    @RequestMapping("/parameter")
    public String getAll(Model model, Parameter parameter) {
        model.addAttribute("parameters", paramService.getAll());
        return "parameter";
    }

    @PostMapping("/paramSave")
    public String save(@Valid Parameter parameter, BindingResult bindingResult, RedirectAttributes redirectAttributes) {
        if (bindingResult.hasErrors()) {

           redirectAttributes.addFlashAttribute("status", "gagal disimpan");

        }

        String symbol = request.getParameter("symbol");
        
        paramService.save(methods.saveParam(symbol));
        redirectAttributes.addFlashAttribute("status", "berhasil disimpan");
        return "redirect:/parameter";
    }
    
    @GetMapping("/paramDelete")
    public String delete(int id,RedirectAttributes redirectAttributes){
        try {
            paramService.delete(id);
            redirectAttributes.addFlashAttribute("status", "berhasil dihapus");
        } catch (Exception e) {
            e.getStackTrace();
            redirectAttributes.addFlashAttribute("status", "gagal dihapus");
        }
        return "redirect:/parameter";
    }
}
