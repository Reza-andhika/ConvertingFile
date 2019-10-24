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
import com.BTS.converter.repositories.HistoryFileRepository;
import com.BTS.converter.services.ClientPartnerService;
import com.BTS.converter.services.DetailDataService;
import com.BTS.converter.services.HistoryFileService;
import com.BTS.converter.services.ParameterService;
import com.BTS.converter.services.TypeService;
import com.BTS.converter.tools.Methods;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
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
    HistoryFileRepository historyRepo;

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

    @Autowired
    Methods method;

    @RequestMapping("/home")
    public String home(Model model) {
        model.addAttribute("history", historyService.getAll());
        model.addAttribute("clients", clientService.getAll());
        return "convert";
    }

    @GetMapping("/convert")
    public String convert(Model model) {
        String clientId = request.getParameter("client");
        ///getById
        ClientPartner client = (ClientPartner) clientService.getById(clientId);

        Date date = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        SimpleDateFormat times = new SimpleDateFormat("HH-mm-ss");
        String format_date = sdf.format(date);
        String format_time = times.format(date);
        String filename = client.getType().getName() + "_" + client.getName() + "_" + format_date + ";" + format_time;
//        method.inserts(client.getIncomingPath() + "\\", client.getParameter().getSymbol());
//        method.converting(client.getOutgoingPath() + "\\" + client.getName(), filename + ".txt", clientId);
//        historyService.save(method.saveHistory(client.getId() + "_" + format_time, client.getIncomingPath(),
//                client.getOutgoingPath() + "\\" + client.getName(), filename + ".txt", 0, clientId));

        if (historyService.save(method.saveHistory(client.getId() + "_" + format_time, client.getIncomingPath(),
                client.getOutgoingPath() + "\\" + client.getName(), filename + ".txt", clientId))) {
            method.inserts(client.getIncomingPath() + "\\", client.getParameter().getSymbol());
            method.converting(client.getOutgoingPath() + "\\" + client.getName(), filename + ".txt", clientId);
            System.out.println("berhasil simpan");
        }else{
            System.out.println("gagal");
        }

//        System.out.println("Coba aja sih ->" + histor.getId() + "_" + histor.getNewFilename());
//        if (histor.getNewFilename() == "") {
//            if (historyRepo.loopCount(clientId) == null) {
//                method.converting(client.getOutgoingPath() + "\\" + client.getName(), filename + ".txt", clientId);
//                historyService.save(method.saveHistory(client.getId() + "_" + format_time, client.getIncomingPath(),
//                        client.getOutgoingPath() + "\\" + client.getName(), filename + ".txt", 0, clientId));
//            } else {
//                method.converting(client.getOutgoingPath() + "\\" + client.getName(), filename + "_" + historyRepo.loopCount(clientId) + ".txt", clientId);
//                historyService.save(method.saveHistory(client.getId() + "_" + format_date + "_" + format_time, client.getIncomingPath(),
//                        client.getOutgoingPath() + "\\" + client.getName(), filename + "_" + 0 + ".txt", historyRepo.loopCount(clientId), clientId));
//            }
//        } else if (histor.getNewFilename().equalsIgnoreCase(filename + ".txt")) {
//            if (historyRepo.loopCount(clientId) == null) {
//                method.converting(client.getOutgoingPath() + "\\" + client.getName(), filename + ".txt", clientId);
//                historyService.save(method.saveHistory(client.getId() + "_" + format_time, client.getIncomingPath(),
//                        client.getOutgoingPath() + "\\" + client.getName(), filename + ".txt", 0, clientId));
//            } else {
//                method.converting(client.getOutgoingPath() + "\\" + client.getName(), filename + "_" + historyRepo.loopCount(clientId) + ".txt", clientId);
//                historyService.save(method.saveHistory(client.getId() + "_" + format_date + "_" + format_time, client.getIncomingPath(),
//                        client.getOutgoingPath() + "\\" + client.getName(), filename + "_" + historyRepo.loopCount(clientId) + ".txt", historyRepo.loopCount(clientId), clientId));
//            }
//        }
        return "redirect:/home";
    }
}
