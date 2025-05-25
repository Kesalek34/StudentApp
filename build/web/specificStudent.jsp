<%-- 
    Document   : specificStudent
    Created on : 25/05/2025, 9:05:05 PM
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
       <h1>Specific Student</h1>
        <p>Find student using name and last name</p>
        
        <form action="name_surnameServlet.do" method="POST">
            
             <tr>
                    <td></td>
                    <td><input type="text" name="firstName"/></td>
                </tr> 
                
             <tr>
                    <td></td>
                    <td><input type="text" name="lastName"/></td>
                </tr> 
                
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET STUDENT"/></td>
                </tr> 
            
        </form>
    </body>
</html>
