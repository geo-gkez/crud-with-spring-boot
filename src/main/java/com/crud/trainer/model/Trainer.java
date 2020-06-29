/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.crud.trainer.model;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author georg
 */
@Entity
@Table(name = "trainer")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Trainer.findAll", query = "SELECT t FROM Trainer t"),
    @NamedQuery(name = "Trainer.findByTrainerid", query = "SELECT t FROM Trainer t WHERE t.trainerid = :trainerid"),
    @NamedQuery(name = "Trainer.findByName", query = "SELECT t FROM Trainer t WHERE t.name = :name"),
    @NamedQuery(name = "Trainer.findBySurname", query = "SELECT t FROM Trainer t WHERE t.surname = :surname"),
    @NamedQuery(name = "Trainer.findBySubject", query = "SELECT t FROM Trainer t WHERE t.subject = :subject")})
public class Trainer implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "trainerid")
    private Integer trainerid;
  
    @Column(name = "name")
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 45, message = "Name must be between 2 and 45")
     @Pattern(regexp = "^[A-Za-z]+$", message="only letters, without spaces (for two or more names use - or _)")
    private String name;
    
    
    @Column(name = "surname")
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 45, message = "Name must be between 2 and 45")
    @Pattern(regexp = "^[A-Za-z]+$", message="only letters, without spaces (for two or more surnames use - or _)")
    private String surname;
    
   
    @Column(name = "subject")
    @NotBlank(message = "Name is mandatory")
    @Size(min = 2, max = 45, message = "Name must be between 2 and 45") 
     @Pattern(regexp = "^[A-Za-z]+$", message="only letters, without spaces (for two or more subjects use - or _)")
    private String subject;

    public Trainer() {
    }

    public Trainer(Integer trainerid) {
        this.trainerid = trainerid;
    }

    public Integer getTrainerid() {
        return trainerid;
    }

    public void setTrainerid(Integer trainerid) {
        this.trainerid = trainerid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (trainerid != null ? trainerid.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Trainer)) {
            return false;
        }
        Trainer other = (Trainer) object;
        if ((this.trainerid == null && other.trainerid != null) || (this.trainerid != null && !this.trainerid.equals(other.trainerid))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.crud.trainer.model.Trainer[ trainerid=" + trainerid + " ]";
    }
    
}
