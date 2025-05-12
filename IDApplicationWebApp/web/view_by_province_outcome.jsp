<%-- 
    Document   : view_by_province_outcome
    Created on : 12 May 2025, 3:39:51 PM
    Author     : Tshepo Mpofu
--%>

<%@page import="za.ac.tut.ejb.entities.Address"%>
<%@page import="za.ac.tut.ejb.entities.Guardian"%>
<%@page import="java.util.List"%>
<%@page import="za.ac.tut.ejb.entities.Applicant"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>All Applications</h1>
        <%
            List<Applicant> applicants = (List<Applicant>)request.getAttribute("applicants");
        %>
        <table border="1">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>NAME</th>
                    <th>SURNAME</th>
                    <th>GENDER</th>
                    <th>DATE OF BIRTH</th>
                    <th>APPLICATION DATE</th>
                    <th>STREET</th>
                    <th>CODE</th>
                    <th>PROVINCE</th>
                    <th colspan="2">Guardians</th>
                </tr>
            </thead>
            <tbody>
                <%
                    for (int i = 0; i < applicants.size(); i++) {                            
                        Applicant applicant = applicants.get(i);
                        Address address = applicant.getAddress();
                        List<Guardian> gs = applicant.getGuardian();
                        
                %>                
                <tr>
                    <td><%=applicant.getId()%></td>
                    <td><%=applicant.getName()%></td>
                    <td><%=applicant.getSurname()%></td>
                    <td><%=applicant.getGender()%></td>
                    <td><%=applicant.getDob()%></td>
                    <td><%=applicant.getApplicationDate()%></td>
                    <td><%=address.getStreet()%></td>
                    <td><%=address.getCode()%></td>
                    <td><%=address.getProvince()%></td>
                    <td><%=gs.get(0).toString()%></td>
                    <td><%=gs.get(1).toString()%></td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

        <ul>
            <li><a href="index.html">Home</a></li>
            <li><a href="apply.jsp">Application Form</a></li>
            <li><a href="menu.jsp">Menu</a></li>
        </ul>
    </body>
</html>
