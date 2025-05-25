<%-- 
    Document   : find_outcome
    Created on : 25/05/2025, 7:32:07 PM
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
        <h1>Student</h1>
        
        <%
           Student p = (Student)request.getAttribute("p");
                Long id = p.getId();
                String name = p.getFirstName();
                String last = p.getLastName();
                String gender = p.getGender();
                Integer age = p.getAge();
                Double perc = p.getPerMark();

            %>
            
            <%=id %>
            <%=name %>
            <%=last%>
            <%=gender%>
            <%=age%>
            <%=perc%>

            
    </body>
</html>
