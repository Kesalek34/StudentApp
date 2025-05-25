<%-- 
    Document   : getStudentsAge
    Created on : 25/05/2025, 9:55:34 PM
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
        <h1>Students age</h1>
       
       
        
        <form action="studentsAgeServlet.do" method="POST">
            <table>
            
                <tr>
                    <td></td>
                    <td><input type="text" name="minAge"/></td>
                </tr> 
            
                 <tr>
                    <td></td>
                    <td><input type="text" name="maxAge"/></td>
                </tr> 
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET AGE"/></td>
                </tr> 
                
                </table>
            
        </form>
    </body>
</html>
