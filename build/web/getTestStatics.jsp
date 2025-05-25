<%-- 
    Document   : getTestStatics
    Created on : 24/05/2025, 9:43:44 PM
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
        <h1>Get Test Stastics </h1>
        <p>Please click on the button below to get statistics </p>
        
        <form action="GetTestStaticsServlet.do" method="POST">
            
                <tr>
                    <td></td>
                    <td><input type="submit" value="GET STASTICS"/></td>
                </tr> 
            
        </form>
    </body>
</html>
