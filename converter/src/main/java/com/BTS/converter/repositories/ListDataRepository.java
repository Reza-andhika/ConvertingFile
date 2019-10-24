/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.repositories;

import com.BTS.converter.entities.CorporateType;
import com.BTS.converter.entities.ListData;
import java.util.List;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Reza
 */
@Repository
public interface ListDataRepository extends CrudRepository<ListData, Integer>{
    @Query(value="select * from tb_tr_list_data where client=?1",nativeQuery = true)
    public List<ListData> getByClient(String client);
    
    @Query(value="select max(id+1) from tb_tr_list_data",nativeQuery = true)
    public Integer loopId();

}
