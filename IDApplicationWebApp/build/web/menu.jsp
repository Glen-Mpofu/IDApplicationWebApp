<%-- 
    Document   : menu
    Created on : 12 May 2025, 1:15:21 PM
    Author     : Tshepo Mpofu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Menu Page</title>
    </head>
    <body>
        <h1>Menu</h1>
        
        <h3>Applicant</h3>
        <ul>
            <li><a href="apply.jsp">Complete Application</a></li>
            <li><a href="cancel_application.jsp">Cancel Application</a></li>
        </ul>
        <h3>Admin</h3>
        <ul>
            <li><a href="view_all_applications.jsp">View All Applications</a></li>
            <li><a href="view_by_gender.jsp">View All Applications by Gender</a></li>
            <li><a href="view_by_province.jsp">View All Applications by Province</a></li>
            <li><a href="send_id.jsp">Send ID to Applicant</a></li>
            <li><a href="delete_fraudulent_application.jsp">Delete Fraudulent Application</a></li>
        </ul>
    </body>
</html>
