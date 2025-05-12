/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.ejb.entities.Applicant;
import za.ac.tut.ejb.entities.Guardian;

/**
 *
 * @author Tshepo Mpofu
 */
@Local
public interface ApplicantFacadeLocal {

    void create(Applicant applicant);

    void edit(Applicant applicant);

    void remove(Applicant applicant);

    Applicant find(Object id);

    List<Applicant> findAll();

    List<Applicant> findRange(int[] range);

    int count();

    List<Applicant> viewByGender(char gender);
    
    List<Applicant> viewByProvince(String province);
}
