/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.repositories;

import com.BTS.converter.entities.ClientPartner;
import com.BTS.converter.entities.HistoryFile;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Reza
 */
@Repository
public interface HistoryFileRepository extends CrudRepository<HistoryFile, String>{
    @Query(value="select * from tb_m_history_file where new_filename=?1", nativeQuery = true)
    public HistoryFile getByFilename(String filename);
    
    @Query(value = "select max(count+1) from tb_m_history_file where client=?1",nativeQuery = true)
    public Integer loopCount(String client);
    
    @Query(value="select * from tb_m_history_file where client=?1", nativeQuery = true)
    public HistoryFile getByClient(String client);
    
}
