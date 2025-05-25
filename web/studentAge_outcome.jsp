<%-- 
    Document   : studentAge_outcome
    Created on : 25/05/2025, 10:43:51 PM
    Author     : kesao
--%>

<%@page import="java.util.List"%>
<%@page import="za.ac.tut.entity.Student"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
       
        
        <%
             List<Student> lists  = (List<Student>)request.getAttribute("lists");
             Integer minAge = (Integer)request.getAttribute("minAge");
             Integer maxAge = (Integer)request.getAttribute("maxAge");
   
            %>
            
            <table>
                <%
                    for (int i = 0; i < lists.size(); i++) {
                            Student p = lists.get(i);
                            
                          String firstname =  p.getFirstName();
                            String lastname = p.getLastName();
                            Double perc = p.getPerMark();
                             String gender = p.getGender();
                            Integer age =p.getAge();
 
                %>
                
                <tr>
                    <td>first name</td>
                    <td><%=firstname%></td>
                </tr>
                
                <tr>
                    <td>last name</td>
                    <td><%=lastname%></td>
                </tr>
                
                 
                <tr>
                    <td>perc</td>
                    <td><%=perc%></td>
                </tr>
                
                 <tr>
                    <td>gender</td>
                    <td><%=gender%></td>
                </tr>
                
                 <tr>
                    <td>age</td>
                    <td><%=age%></td>
                </tr>
                
                
            </table>
                <%
                        }
%>

            
           
                
                
                
                
    </body>
</html>
