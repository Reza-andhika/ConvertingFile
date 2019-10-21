/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.repositories;

import com.BTS.converter.entities.HistoryFile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Reza
 */
public interface HistoryFileRepository extends CrudRepository<HistoryFile, String>{
    @Query("select * from tb_m_history_file where old_filename=?1")
    public String getByFilename(String OldFilename);
}
