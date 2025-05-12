/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.ejb.entities.Guardian;

/**
 *
 * @author Tshepo Mpofu
 */
@Local
public interface GuardianFacadeLocal {

    void create(Guardian guardian);

    void edit(Guardian guardian);

    void remove(Guardian guardian);

    Guardian find(Object id);

    List<Guardian> findAll();

    List<Guardian> findRange(int[] range);

    int count();
    
}
