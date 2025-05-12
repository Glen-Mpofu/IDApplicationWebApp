<%-- 
    Document   : delete_fraudulent_application
    Created on : 12 May 2025, 3:01:20 PM
    Author     : Tshepo Mpofu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Delete Fraudulent Application Page</title>
    </head>
    <body>
        <h1>Delete Fraudulent Application</h1>
        <form action="DeleteApplicationServlet.do" method="POST">
            <table>
                <thead>
                    <tr>
                        <th></th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>ID</td>
                        <td><input type="text" name="id"></td>
                    </tr>
                    <tr>
                        <td></td>
                        <td><input type="SUBMIT" value="DELETE ID"></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
