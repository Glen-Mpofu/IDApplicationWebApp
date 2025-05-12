/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package za.ac.tut.ejb.bl;

import java.util.List;
import javax.annotation.security.RolesAllowed;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.ejb.entities.Applicant;
import za.ac.tut.ejb.entities.Guardian;

/**
 *
 * @author Tshepo Mpofu
 */
@Stateless
public class ApplicantFacade extends AbstractFacade<Applicant> implements ApplicantFacadeLocal {

    @PersistenceContext(unitName = "IDApplicationEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public ApplicantFacade() {
        super(Applicant.class);
    }

     @RolesAllowed("admin")
    @Override
    public List<Applicant> viewByGender(char gender) {
        Query query = em.createQuery("SELECT a FROM Applicant a WHERE a.gender = ?1");
        query.setParameter(1, gender);
        List<Applicant> applicants = query.getResultList();
        return applicants;
    }
    
    @RolesAllowed("admin")
    @Override
    public List<Applicant> viewByProvince(String province) {
        Query query = em.createQuery("SELECT a FROM Applicant a WHERE a.address.province = ?1");
        query.setParameter(1, province);
        List<Applicant> applicants = query.getResultList();
        return applicants;
    }

    @RolesAllowed("admin")
    @Override
    public void sendId(Object id) {
        Applicant app = find(id);
        remove(app);
    }

    @RolesAllowed("admin")
    @Override
    public void deleteFraudulentApplications(Applicant app) {
        remove(app);
    }

    @RolesAllowed("admin")
    @Override
    public List<Applicant> viewAllApplications() {
        List<Applicant> list = findAll();
        return list;
    }
}
