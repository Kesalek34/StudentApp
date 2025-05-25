/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.servlet;

import java.io.IOException;
import java.io.PrintWriter;
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
public class name_surnameServlet extends HttpServlet {
@EJB StudentFacadeLocal cfl;
   

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        
        Student p = cfl.find(firstName, lastName);
        
        request.setAttribute("p", p);
        
        
        
    RequestDispatcher disp = request.getRequestDispatcher("name_Outcome.jsp");
    disp.forward(request, response);
    
    }

}
