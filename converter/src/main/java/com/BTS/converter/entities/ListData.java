/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.entities;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Reza
 */
@Entity
@Table(name = "tb_tr_list_data")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ListData.findAll", query = "SELECT l FROM ListData l"),
    @NamedQuery(name = "ListData.findById", query = "SELECT l FROM ListData l WHERE l.id = :id"),
    @NamedQuery(name = "ListData.findByField1", query = "SELECT l FROM ListData l WHERE l.field1 = :field1"),
    @NamedQuery(name = "ListData.findByField2", query = "SELECT l FROM ListData l WHERE l.field2 = :field2"),
    @NamedQuery(name = "ListData.findByField3", query = "SELECT l FROM ListData l WHERE l.field3 = :field3"),
    @NamedQuery(name = "ListData.findByField4", query = "SELECT l FROM ListData l WHERE l.field4 = :field4"),
    @NamedQuery(name = "ListData.findByField5", query = "SELECT l FROM ListData l WHERE l.field5 = :field5"),
    @NamedQuery(name = "ListData.findByField6", query = "SELECT l FROM ListData l WHERE l.field6 = :field6"),
    @NamedQuery(name = "ListData.findByField7", query = "SELECT l FROM ListData l WHERE l.field7 = :field7"),
    @NamedQuery(name = "ListData.findByField8", query = "SELECT l FROM ListData l WHERE l.field8 = :field8"),
    @NamedQuery(name = "ListData.findByField9", query = "SELECT l FROM ListData l WHERE l.field9 = :field9"),
    @NamedQuery(name = "ListData.findByField10", query = "SELECT l FROM ListData l WHERE l.field10 = :field10")})
public class ListData implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @Size(max = 100)
    @Column(name = "Field_1")
    private String field1;
    @Size(max = 100)
    @Column(name = "Field_2")
    private String field2;
    @Size(max = 100)
    @Column(name = "Field_3")
    private String field3;
    @Size(max = 100)
    @Column(name = "Field_4")
    private String field4;
    @Size(max = 100)
    @Column(name = "Field_5")
    private String field5;
    @Size(max = 100)
    @Column(name = "Field_6")
    private String field6;
    @Size(max = 100)
    @Column(name = "Field_7")
    private String field7;
    @Size(max = 100)
    @Column(name = "Field_8")
    private String field8;
    @Size(max = 100)
    @Column(name = "Field_9")
    private String field9;
    @Size(max = 100)
    @Column(name = "Field_10")
    private String field10;
    @JoinColumn(name = "client", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ClientPartner client;

    public ListData() {
    }

    public ListData(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getField1() {
        return field1;
    }

    public void setField1(String field1) {
        this.field1 = field1;
    }

    public String getField2() {
        return field2;
    }

    public void setField2(String field2) {
        this.field2 = field2;
    }

    public String getField3() {
        return field3;
    }

    public void setField3(String field3) {
        this.field3 = field3;
    }

    public String getField4() {
        return field4;
    }

    public void setField4(String field4) {
        this.field4 = field4;
    }

    public String getField5() {
        return field5;
    }

    public void setField5(String field5) {
        this.field5 = field5;
    }

    public String getField6() {
        return field6;
    }

    public void setField6(String field6) {
        this.field6 = field6;
    }

    public String getField7() {
        return field7;
    }

    public void setField7(String field7) {
        this.field7 = field7;
    }

    public String getField8() {
        return field8;
    }

    public void setField8(String field8) {
        this.field8 = field8;
    }

    public String getField9() {
        return field9;
    }

    public void setField9(String field9) {
        this.field9 = field9;
    }

    public String getField10() {
        return field10;
    }

    public void setField10(String field10) {
        this.field10 = field10;
    }

    public ClientPartner getClient() {
        return client;
    }

    public void setClient(ClientPartner client) {
        this.client = client;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ListData)) {
            return false;
        }
        ListData other = (ListData) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.BTS.converter.entities.ListData[ id=" + id + " ]";
    }
    
}
