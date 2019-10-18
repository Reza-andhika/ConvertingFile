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
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author Reza
 */
@Entity
@Table(name = "tb_m_history_file")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "HistoryFile.findAll", query = "SELECT h FROM HistoryFile h"),
    @NamedQuery(name = "HistoryFile.findById", query = "SELECT h FROM HistoryFile h WHERE h.id = :id"),
    @NamedQuery(name = "HistoryFile.findByOldPath", query = "SELECT h FROM HistoryFile h WHERE h.oldPath = :oldPath"),
    @NamedQuery(name = "HistoryFile.findByOldExtension", query = "SELECT h FROM HistoryFile h WHERE h.oldExtension = :oldExtension"),
    @NamedQuery(name = "HistoryFile.findByNewPath", query = "SELECT h FROM HistoryFile h WHERE h.newPath = :newPath"),
    @NamedQuery(name = "HistoryFile.findByNewExtension", query = "SELECT h FROM HistoryFile h WHERE h.newExtension = :newExtension")})
public class HistoryFile implements Serializable {
    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "id")
    private String id;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "old_path")
    private String oldPath;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "old_extension")
    private String oldExtension;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "new_path")
    private String newPath;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 35)
    @Column(name = "new_extension")
    private String newExtension;
    @JoinColumn(name = "client", referencedColumnName = "id")
    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    private ClientPartner client;

    public HistoryFile() {
    }

    public HistoryFile(String id) {
        this.id = id;
    }

    public HistoryFile(String id, String oldPath, String oldExtension, String newPath, String newExtension) {
        this.id = id;
        this.oldPath = oldPath;
        this.oldExtension = oldExtension;
        this.newPath = newPath;
        this.newExtension = newExtension;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getOldPath() {
        return oldPath;
    }

    public void setOldPath(String oldPath) {
        this.oldPath = oldPath;
    }

    public String getOldExtension() {
        return oldExtension;
    }

    public void setOldExtension(String oldExtension) {
        this.oldExtension = oldExtension;
    }

    public String getNewPath() {
        return newPath;
    }

    public void setNewPath(String newPath) {
        this.newPath = newPath;
    }

    public String getNewExtension() {
        return newExtension;
    }

    public void setNewExtension(String newExtension) {
        this.newExtension = newExtension;
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
        if (!(object instanceof HistoryFile)) {
            return false;
        }
        HistoryFile other = (HistoryFile) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.BTS.converter.entities.HistoryFile[ id=" + id + " ]";
    }
    
}
