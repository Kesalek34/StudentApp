<%-- 
    Document   : findStudent
    Created on : 25/05/2025, 7:17:23 PM
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
        <h1>Find Student</h1>
        <p>Please click on the button below to get student </p>
        
        <form action="GetStudentID.do" method="POST">
            
             <tr>
                    <td></td>
                    <td><input type="text" name="id"/></td>
                </tr> 
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET STUDENT"/></td>
                </tr> 
            
        </form>
    </body>
</html>
