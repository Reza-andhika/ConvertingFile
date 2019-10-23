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
import com.BTS.converter.entities.CorporateType;
import com.BTS.converter.services.ClientPartnerService;
import com.BTS.converter.services.DetailDataService;
import com.BTS.converter.services.HistoryFileService;
import com.BTS.converter.services.ParameterService;
import com.BTS.converter.services.TypeService;
import com.BTS.converter.tools.Methods;
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
public class ConverterController {

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

    private Methods method;

    @RequestMapping("/###")
    public String home() {

        return "###";
    }

    @PostMapping("/###")
    public String convert(Model model, BindingResult bindingResult) {
        String clientId = request.getParameter("samakan dengan nama inputan");

        ///getAll
        ClientPartner clients = (ClientPartner) clientService.getAll();
        HistoryFile histories = (HistoryFile) historyService.getAll();
        CorporateType types = (CorporateType) typeService.getAll();
        Parameter params = (Parameter) paramService.getAll();
        DetailData datas = (DetailData) dataService.getAll();

        ///getById
        ClientPartner client = (ClientPartner) clientService.getById(clientId);

//        List<String>delim = new ArrayList<String>();
//        delim.add(client.getParameter().getSymbol());
//        
        method.inserts(client.getIncomingPath(), client.getParameter().getSymbol());
        method.converting(client.getOutgoingPath(), "ganti dengan manipulasi String untuk nama file", clientId);

        method.saveHistory("isi sesuai kesepakatan", client.getIncomingPath(), client.getOutgoingPath(), "penamaan file yang disepakati", clientId);

        return "";
    }
}
