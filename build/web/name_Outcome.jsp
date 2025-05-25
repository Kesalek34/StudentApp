<%-- 
    Document   : name_Outcome
    Created on : 25/05/2025, 9:17:44 PM
    Author     : kesao
--%>

<%@page import="za.ac.tut.entity.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
   
        <h1>Surname and name</h1>
        
        <%
            Student p = (Student)request.getAttribute("p");
            String name = p.getFirstName();
            String lastname = p.getLastName();
            
            %>
            <p>
            <%=name%>
            <%=lastname%>
 
            </p>
    </body>
</html>
