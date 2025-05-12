/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.entities;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Tshepo Mpofu
 */
@Entity
public class Guardian implements Serializable {

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
    
    @Column(name = "RELATIONSHIP")
    private String relationship;

    public Guardian(Long id, String name, String surname, Date dob) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.dob = dob;
    }

    public Guardian() {
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

    public Date getDob() {
        return dob;
    }

    public void setDob(Date dob) {
        this.dob = dob;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getRelationship() {
        return relationship;
    }

    public void setRelationship(String relationship) {
        this.relationship = relationship;
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
        if (!(object instanceof Guardian)) {
            return false;
        }
        Guardian other = (Guardian) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return getName()+ "/" + getSurname()+ "/(" +getId() + ")/" + getDob() + "/" + getRelationship();
    }
    
}
