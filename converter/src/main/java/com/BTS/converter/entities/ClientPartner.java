/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BTS.converter.entities;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author Reza
 */
@Entity
@Table(name = "tb_m_client_partner")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "ClientPartner.findAll", query = "SELECT c FROM ClientPartner c"),
    @NamedQuery(name = "ClientPartner.findById", query = "SELECT c FROM ClientPartner c WHERE c.id = :id"),
    @NamedQuery(name = "ClientPartner.findByName", query = "SELECT c FROM ClientPartner c WHERE c.name = :name"),
    @NamedQuery(name = "ClientPartner.findByIncomingPath", query = "SELECT c FROM ClientPartner c WHERE c.incomingPath = :incomingPath"),
    @NamedQuery(name = "ClientPartner.findByOutgoingPath", query = "SELECT c FROM ClientPartner c WHERE c.outgoingPath = :outgoingPath")})
public class ClientPartner implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 25)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "name")
    private String name;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "incoming_path")
    private String incomingPath;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 100)
    @Column(name = "outgoing_path")
    private String outgoingPath;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client", fetch = FetchType.LAZY)
    private List<ListData> listDataList;
    @JoinColumn(name = "parameter", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private Parameter parameter;
    @JoinColumn(name = "type", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private CorporateType type;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "client", fetch = FetchType.LAZY)
    private List<HistoryFile> historyFileList;

    public ClientPartner() {
    }

    public ClientPartner(String id) {
        this.id = id;
    }

    public ClientPartner(String id, String name, String incomingPath, String outgoingPath) {
        this.id = id;
        this.name = name;
        this.incomingPath = incomingPath;
        this.outgoingPath = outgoingPath;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getIncomingPath() {
        return incomingPath;
    }

    public void setIncomingPath(String incomingPath) {
        this.incomingPath = incomingPath;
    }

    public String getOutgoingPath() {
        return outgoingPath;
    }

    public void setOutgoingPath(String outgoingPath) {
        this.outgoingPath = outgoingPath;
    }

    @XmlTransient
    public List<ListData> getListDataList() {
        return listDataList;
    }

    public void setListDataList(List<ListData> listDataList) {
        this.listDataList = listDataList;
    }

    public Parameter getParameter() {
        return parameter;
    }

    public void setParameter(Parameter parameter) {
        this.parameter = parameter;
    }

    public CorporateType getType() {
        return type;
    }

    public void setType(CorporateType type) {
        this.type = type;
    }

    @XmlTransient
    public List<HistoryFile> getHistoryFileList() {
        return historyFileList;
    }

    public void setHistoryFileList(List<HistoryFile> historyFileList) {
        this.historyFileList = historyFileList;
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
        if (!(object instanceof ClientPartner)) {
            return false;
        }
        ClientPartner other = (ClientPartner) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.BTS.converter.entities.ClientPartner[ id=" + id + " ]";
    }
    
}
