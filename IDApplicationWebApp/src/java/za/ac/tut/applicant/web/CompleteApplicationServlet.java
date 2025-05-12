/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.applicant.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.ApplicantFacadeLocal;
import za.ac.tut.ejb.entities.Address;
import za.ac.tut.ejb.entities.Applicant;
import za.ac.tut.ejb.entities.Guardian;

/**
 *
 * @author Tshepo Mpofu
 */
public class CompleteApplicationServlet extends HttpServlet {
    @EJB private ApplicantFacadeLocal afl;
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        try {
            Long aId = Long.parseLong(request.getParameter("applicantId"));
            String applicantName = request.getParameter("applicantName");
            String applicantSurname = request.getParameter("applicantSurname");
            
            String applicantDob = request.getParameter("applicantDob");
            SimpleDateFormat simpleFormat = new SimpleDateFormat("yyyy-mm-dd");
            Date aDob = simpleFormat.parse(applicantDob);
            
            Character gender = request.getParameter("gender").charAt(0);

            //guardian 1
            Long gId = Long.parseLong(request.getParameter("guardianId1"));
            String guardianName = request.getParameter("guardianName1");
            String guardianSurname = request.getParameter("guardianSurname1");
            
            String guardianDob = request.getParameter("guardianDob1");
            Date gDob = simpleFormat.parse(guardianDob);
            
            String relationship = request.getParameter("relationship1");
           
            Guardian guardian = new Guardian(gId, guardianName, guardianSurname, gDob);
            guardian.setRelationship(relationship);
            //guardian 2
            Long gId2 = Long.parseLong(request.getParameter("guardianId2"));
            String guardianName2 = request.getParameter("guardianName2");
            String guardianSurname2 = request.getParameter("guardianSurname2");
            
            String guardianDob2 = request.getParameter("guardianDob2");
            Date gDob2 = simpleFormat.parse(guardianDob);
            
            String relationship2 = request.getParameter("relationship2");
            
            Guardian guardian2 = new Guardian(gId2, guardianName2, guardianSurname2, gDob2);
            guardian2.setRelationship(relationship2);
            //address
            String street = request.getParameter("street");
            Integer code = Integer.parseInt(request.getParameter("code"));
            String province = request.getParameter("province");
            
            Address address = new Address(street, code, province);
            Applicant applicant = new Applicant(aId, applicantName, applicantSurname, aDob, aDob, address, gender);
            
            List<Guardian> gs = new ArrayList<>();
            gs.add(guardian);
            gs.add(guardian2);
            applicant.setGuardian(gs);
            
            afl.create(applicant);
            
            RequestDispatcher disp = request.getRequestDispatcher("application_complete.jsp");
            disp.forward(request, response);
        } catch (ParseException ex) {
            Logger.getLogger(CompleteApplicationServlet.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
