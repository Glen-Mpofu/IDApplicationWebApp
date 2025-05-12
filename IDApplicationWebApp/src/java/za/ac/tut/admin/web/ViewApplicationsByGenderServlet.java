/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/JSP_Servlet/Servlet.java to edit this template
 */
package za.ac.tut.admin.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.ejb.bl.ApplicantFacadeLocal;
import za.ac.tut.ejb.entities.Applicant;

/**
 *
 * @author Tshepo Mpofu
 */
public class ViewApplicationsByGenderServlet extends HttpServlet {
    @EJB private ApplicantFacadeLocal afl;
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        List<Applicant> maleApplicants = afl.viewByGender('M');
        List<Applicant> femaleApplicants = afl.viewByGender('F');
        request.setAttribute("maleApplicants", maleApplicants);
        request.setAttribute("femaleApplicants", femaleApplicants);
        
        RequestDispatcher disp = request.getRequestDispatcher("view_by_gender_outcome.jsp");
        disp.forward(request, response);
    }

}
