<%-- 
    Document   : view_by_gender
    Created on : 12 May 2025, 3:27:17 PM
    Author     : Tshepo Mpofu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>View All Applications by Gender</h1>
        <form action="ViewApplicationsByGenderServlet.do" method="GET">
            <table>
                <thead>
                    <tr>
                        <th>Click button below to view all applications</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td><input type="SUBMIT" value="VIEW APPLICATIONS"></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
