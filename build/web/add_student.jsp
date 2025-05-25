<%-- 
    Document   : add_student
    Created on : 24/05/2025, 7:20:14 PM
    Author     : kesao
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Add Student</h1>
        
        <p>Please add student details below:</p>
        
        <form action="AddStudentServlet.do" method="POST">
            
            <table>
                <tr>
                    <td>Student number:</td>
                    <td><input type="text" name="id"/></td>
                </tr>
                
                <tr>
                    <td>Name:</td>
                    <td><input type="text" name="firstName"/></td>
                </tr>
                
                <tr>
                    <td>Surname:</td>
                    <td><input type="text" name="lastName"/></td>
                </tr>
                
                <tr>
                    <td>Age:</td>
                    <td><input type="text" name="age"/></td>
                </tr>
                
                <tr>
                    <td>Mark:</td>
                    <td><input type="text" name="perMark"/></td>
                </tr>
                
                <tr>
                    <td>Gender:</td>
                    <td>
                        <select name="gender">
                            
                            <option value="F">F</option>
                            <option value="M">M</option>
                        </select>
                    </td>
                    
                </tr>
                
                
                 <tr>
                    <td></td>
                    <td><input type="submit" name="ADD STUDENT"/></td>
                </tr>
                
            </table>
            
  
                
        </form>
    </body>
</html>
