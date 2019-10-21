/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.controllers;

import com.BTS.converter.entities.ClientPartner;
import com.BTS.converter.entities.DetailData;
import com.BTS.converter.entities.HistoryFile;
import com.BTS.converter.entities.Parameter;
import com.BTS.converter.entities.Type;
import com.BTS.converter.services.ClientPartnerService;
import com.BTS.converter.services.DetailDataService;
import com.BTS.converter.services.HistoryFileService;
import com.BTS.converter.services.ParameterService;
import com.BTS.converter.services.TypeService;
import com.BTS.converter.tools.Method;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
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
public class ConvertController {

    @Autowired
    HistoryFileService historyService;

    @Autowired
    TypeService typeService;

    @Autowired
    ParameterService paramService;

    @Autowired
    ClientPartnerService clientService;

    @Autowired
    DetailDataService dataService;

    @Autowired
    HttpServletRequest request;

    private Method method;

    @RequestMapping("/###")
    public String home() {

        return "###";
    }

    @PostMapping("/###")
    public String convert(Model model, BindingResult bindingResult) {
        String OldPath = request.getParameter("samakan dengan nama inputan");
        String OldFilename = request.getParameter("samakan dengan nama inputan");
        String newPath = request.getParameter("samakan dengan nama inputan");
        String newFilename = request.getParameter("samakan dengan nama inputan");
        String clientId = request.getParameter("samakan dengan nama inputan");

        ///getAll
        ClientPartner clients = (ClientPartner) clientService.getAll();
        HistoryFile histories = (HistoryFile) historyService.getAll();
        Type types = (Type) typeService.getAll();
        Parameter params = (Parameter) paramService.getAll();
        DetailData datas = (DetailData) dataService.getAll();
        
        ///getById
        ClientPartner client = (ClientPartner) clientService.getById(clientId);
        
//        List<String>delim = new ArrayList<String>();
//        delim.add(client.getParameter().getSymbol());
//        
        if (historyService.getByFilename(OldFilename)) {
            method.readCsvUsingLoad(OldPath, OldFilename, client.getParameter().getSymbol());
            
        } else {
            System.out.println("File sudah digunakan");
            method.renameExtension(OldPath, OldFilename);
        }
        return "";
    }
}
