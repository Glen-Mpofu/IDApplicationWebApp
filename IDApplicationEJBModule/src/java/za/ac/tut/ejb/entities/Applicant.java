/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.entities;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tshepo Mpofu
 */
@Entity
public class Applicant implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Column(name = "ID_NUMBER", length = 13)
    private Long id;
    
    @Column(name = "NAME", length = 20)
    private String name;
    
    @Column(name = "SURNAME", length = 20)
    private String surname;    

    @Temporal(TemporalType.DATE)
    @Column(name = "DATE_OF_BIRTH")
    private Date dob;
    
    @Column(name = "GENDER", length = 1)
    private Character gender;
    
    @Temporal(TemporalType.DATE)
    @Column(name = "APPLICATION_DATE")
    private Date applicationDate;
    
    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private List<Guardian> guardian = new ArrayList<>();
    
    @OneToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    private Address address;
    
    public Applicant() {
    }

    public Applicant(Long id, String name, String surname, Date dob, Date applicationDate, Address address, Character gender) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
        this.applicationDate = applicationDate;
        this.address = address;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public Character getGender() {
        return gender;
    }

    public void setGender(Character gender) {
        this.gender = gender;
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Date getApplicationDate() {
        return applicationDate;
    }

    public void setApplicationDate(Date applicationDate) {
        this.applicationDate = applicationDate;
    }

    public List<Guardian> getGuardian() {
        return guardian;
    }

    public void setGuardian(List<Guardian> guardian) {
        this.guardian = guardian;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
        if (!(object instanceof Applicant)) {
            return false;
        }
        Applicant other = (Applicant) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "za.ac.tut.ejb.entities.Applicant[ id=" + id + " ]";
    }
    
}
