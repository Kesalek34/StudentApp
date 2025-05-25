/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.ejb.EJB;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import za.ac.tut.bl.StudentFacadeLocal;
import za.ac.tut.entity.Student;

/**
 *
 * @author kesao
 */
public class studentsAgeServlet extends HttpServlet {
@EJB StudentFacadeLocal cfl;
  
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
    
        Integer minAge = Integer.parseInt(request.getParameter("minAge"));
        Integer maxAge = Integer.parseInt(request.getParameter("maxAge"));
        
           List<Student> lists = cfl.findRangeWithinAge(minAge, maxAge);
           
           
    request.setAttribute("lists", lists);
        
        
        
    RequestDispatcher disp = request.getRequestDispatcher("studentAge_outcome.jsp");
    disp.forward(request, response);
        
        
    }
}
