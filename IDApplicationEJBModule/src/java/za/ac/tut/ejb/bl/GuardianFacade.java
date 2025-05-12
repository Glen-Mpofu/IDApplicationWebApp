/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.bl;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import za.ac.tut.ejb.entities.Guardian;

/**
 *
 * @author Tshepo Mpofu
 */
@Stateless
public class GuardianFacade extends AbstractFacade<Guardian> implements GuardianFacadeLocal {

    @PersistenceContext(unitName = "IDApplicationEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public GuardianFacade() {
        super(Guardian.class);
    }
    
}
