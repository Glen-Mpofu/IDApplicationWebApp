<%-- 
    Document   : view_by_province
    Created on : 12 May 2025, 3:36:10 PM
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
        <h1>View All Applications By Province</h1>
        <form action="ViewApplicantsByProvinceServlet.do" method="POST">
            <table>
                <thead>
                    <tr>
                        <th colspan="2">Click button below to view all applications</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>Province:</td>
                        <td><input type="text" name="province"></td>
                    </tr>
                    <tr>
                        <td>                            
                        </td>
                        <td><input type="SUBMIT" value="VIEW APPLICATIONS"></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
