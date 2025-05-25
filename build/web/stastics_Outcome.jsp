<%-- 
    Document   : stastics_Outcome
    Created on : 24/05/2025, 10:19:18 PM
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
        <h1>STASTICS</h1>
        
        <%
               
   List<Student> list = (List<Student>)request.getAttribute("list");
   
   Integer count = (Integer)request.getAttribute("count");
   
   Integer cntAllMaleStudents =  (Integer)request.getAttribute("count");
   
   Integer cntAllFeMaleStudents = (Integer)request.getAttribute("cntAllFeMaleStudents");
    
    Integer cntPassedStudents = (Integer)request.getAttribute("cntPassedStudents");
    Integer cntFaildedStudents= (Integer)request.getAttribute("cntFaildedStudents");
    
    
    Integer cntPassedMalesStudents = (Integer)request.getAttribute("cntPassedMalesStudents");
    Integer cntPassedFeMalesStudents = (Integer)request.getAttribute("cntPassedFeMalesStudents");
    
    Integer cntFailedMaleStduents = (Integer)request.getAttribute("cntFailedMaleStduents");
    Integer cntFailedFeMaleStduents= (Integer)request.getAttribute("cntFailedFeMaleStduents");
   
            
            %>
            
          
            
            <table>
                <%
                    for (int i = 0; i < list.size(); i++) {
                            Student p = list.get(i);
                            
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

            
            <p><%=count%></p>
            <p><%=cntAllMaleStudents%></p>
            <p><%=cntAllFeMaleStudents%></p>
            <p><%=cntFaildedStudents%></p>
            <p><%=cntPassedStudents%></p>
            
            <p><%=cntPassedMalesStudents%></p>
            <p><%=cntPassedFeMalesStudents%></p>
            <p><%=cntFailedMaleStduents%></p>
            <p><%=cntFailedFeMaleStduents%></p>
    
    </body>
</html>
