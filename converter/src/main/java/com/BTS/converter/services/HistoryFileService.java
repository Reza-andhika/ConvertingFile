/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.services;

import com.BTS.converter.entities.ClientPartner;
import com.BTS.converter.entities.HistoryFile;
import com.BTS.converter.repositories.HistoryFileRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author Reza
 */
@Service
public class HistoryFileService {
    @Autowired
    HistoryFileRepository historyRepo;
    
    public Iterable<HistoryFile> getAll(){
        return historyRepo.findAll();
    }
    
    public boolean save(HistoryFile history){
        if (historyRepo.save(history)!=null) {
            return true;
        } else {
            return false;
        }
    }
    
    public HistoryFile getById(String id){
        return historyRepo.findById(id).get();
    }
    
    public boolean getByFilename(String OldFilename){
        boolean hasil = false;
        if(historyRepo.getByFilename(OldFilename).equalsIgnoreCase("")){
            hasil = true;
        }
        else{
            System.out.println("File sudah digunakan");
            hasil = false;
        }
        return hasil;
    }
}
