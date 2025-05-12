<%-- 
    Document   : apply
    Created on : 12 May 2025, 1:21:44 PM
    Author     : Tshepo Mpofu
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>ID Application Page Page</title>
    </head>
    <body>
        <h1>ID Application</h1>
        <form action="CompleteApplicationServlet.do" method="POST">
            <table>
                <thead>
                    <tr>
                        <th colspan="2">ENTER ALL DETAILS BELOW</th>
                    </tr>
                </thead>
                <tbody>
                    <tr>
                        <td>ID</td>
                        <td><input type="text" name="applicantId"></td>
                    </tr>
                    <tr>
                        <td>Name</td>
                        <td><input type="text" name="applicantName"></td>
                    </tr>
                    <tr>
                        <td>Surname</td>
                        <td><input type="text" name="applicantSurname"></td>
                    </tr>
                    <tr>
                        <td>Date of Birth</td>
                        <td><input type="date" name="applicantDob"></td>
                    </tr>
                    <tr>
                        <td>Gender</td>
                        <td>                            
                            <select name="gender">
                                <option value="M">Male</option>
                                <option value="F">Female</option>
                                <option value="O">Other</option>
                            </select>
                        </td>
                    </tr>
                    
                    <tr>
                        <td>Guardian ID</td>
                        <td><input type="text" name="guardianId1"></td>
                    </tr>
                    <tr>
                        <td>Guardian Name</td>
                        <td><input type="text" name="guardianName1"></td>
                    </tr>
                    <tr>
                        <td>Guardian Surname</td>
                        <td><input type="text" name="guardianSurname1"></td>
                    </tr>
                    <tr>
                        <td>Guardian Date of Birth</td>
                        <td><input type="date" name="guardianDob1"></td>
                    </tr>   
                    <tr>
                        <td>Relationship</td>
                        <td>
                            <select name="relationship1">
                                <option value="mother">Mother</option>
                                <option value="father">Father</option>
                                <option value="caretaker">Caretaker</option>
                            </select>

                        </td>
                    </tr>    
                    
                     <tr>
                        <td>Guardian 2 ID</td>
                        <td><input type="text" name="guardianId2"></td>
                    </tr>
                    <tr>
                        <td>Guardian 2 Name</td>
                        <td><input type="text" name="guardianName2"></td>
                    </tr>
                    <tr>
                        <td>Guardian 2 Surname</td>
                        <td><input type="text" name="guardianSurname2"></td>
                    </tr>
                    <tr>
                        <td>Guardian 2 Date of Birth</td>
                        <td><input type="date" name="guardianDob2"></td>
                    </tr>   
                    <tr>
                        <td>Relationship</td>
                        <td>
                            <select name="relationship2">
                                <option value="mother">Mother</option>
                                <option value="father">Father</option>
                                <option value="caretaker">Caretaker</option>
                            </select>

                        </td>
                    </tr> 
                    
                    <tr>
                        <td>Street</td>
                        <td><input type="text" name="street"></td>
                    </tr>
                    <tr>
                        <td>Code</td>
                        <td><input type="text" name="code"></td>
                    </tr>
                    <tr>
                        <td>Province</td>
                        <td><input type="text" name="province"></td>
                    </tr>
                    
                    <tr>
                        <td></td>
                        <td><input type="SUBMIT" value="SUBMIT APPLICATION"></td>
                    </tr>
                </tbody>
            </table>

        </form>
    </body>
</html>
