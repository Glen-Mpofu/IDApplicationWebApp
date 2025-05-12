<%-- 
    Document   : send_id
    Created on : 12 May 2025, 2:54:19 PM
    Author     : Tshepo Mpofu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Send ID to Applicant Page</title>
    </head>
    <body>
        <h1>Send ID to Applicant</h1>
        <form action="SendIdServlet.do" method="POST">
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
                        <td><input type="SUBMIT" value="SEND ID"></td>
                    </tr>
                </tbody>
            </table>
        </form>
    </body>
</html>
