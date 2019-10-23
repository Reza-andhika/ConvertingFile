/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.repositories;

import com.BTS.converter.entities.ClientPartner;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author Reza
 */
public interface ClientPartnerRepository extends CrudRepository<ClientPartner, String>{
    @Query(value = "select * from tb_m_client_partner where id=?1", nativeQuery = true)
    public String getById(String id);
}
