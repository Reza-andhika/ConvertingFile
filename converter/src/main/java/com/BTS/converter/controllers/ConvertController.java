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
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
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

    private Method method;

    @RequestMapping("/###")
    public String home() {

        return "###";
    }

    @PostMapping("/###")
    public String convert(String OldPath, String OldFilename, String newPath, String newFilename) {
        ClientPartner client = (ClientPartner) clientService.getAll();
        HistoryFile history = (HistoryFile) historyService.getAll();
        Type type = (Type) typeService.getAll();
        Parameter param = (Parameter) paramService.getAll();
        DetailData data = (DetailData) dataService.getAll();

        String Cekpath = OldPath + "/" + OldFilename;
        String equalPath = history.getOldPath() + "/" + history.getOldFilename();
        if (Cekpath.equalsIgnoreCase(equalPath)) {
            System.out.println("File sudah digunakan");
            method.renameExtension(OldPath, OldFilename);
        } else {
            method.readCsvUsingLoad(OldPath, client.getParameter().getSymbol());
            
        }
        return "";
    }
}
