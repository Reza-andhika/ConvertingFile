/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.services;

import com.BTS.converter.entities.ClientPartner;
import com.BTS.converter.entities.ListData;
import com.BTS.converter.repositories.ClientPartnerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.BTS.converter.repositories.ListDataRepository;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Reza
 */
@Service
public class ListDataService {

    @Autowired
    ListDataRepository listRepo;

    @Autowired
    ClientPartnerRepository clientRepo;

    public Iterable<ListData> getAll() {
        return listRepo.findAll();
    }

//    public List<ListData> getByClientId(String id){
//        return (List<ListData>) listRepo.findById(Integer.parseInt(id)).get(); 
//    }
    public boolean save(ListData data) {
        boolean hasil = false;
        if (listRepo.save(data) != null) {
            hasil = true;
        } else {
            hasil = false;
        }
        return hasil;
    }
    
//    public int loopid(int id){
//        id = listRepo.loopId(id)+1;
//        return id;
//    }
}
