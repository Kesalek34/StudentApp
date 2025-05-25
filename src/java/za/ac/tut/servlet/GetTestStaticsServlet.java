/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.servlet;

import java.io.IOException;
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
public class GetTestStaticsServlet extends HttpServlet {
@EJB StudentFacadeLocal cfl;
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
    
     
   List<Student> list = cfl.findAll();
   Integer count = cfl.count();
   Integer cntAllMaleStudents = cfl.cntAllMaleStudents();
   
    Integer cntAllFeMaleStudents= cfl.cntAllFeMaleStudents();
    
    Integer cntPassedStudents = cfl.cntPassedStudents();
    Integer cntFaildedStudents= cfl.cntFaildedStudents();
    
    
    Integer cntPassedMalesStudents = cfl.cntPassedMalesStudents();
    Integer cntPassedFeMalesStudents = cfl.cntPassedFeMalesStudents();
    
    Integer cntFailedMaleStduents = cfl.cntFailedMaleStduents();
    Integer cntFailedFeMaleStduents= cfl.cntFailedFeMaleStduents();
    
   
    
    
    request.setAttribute("list", list);
    request.setAttribute("count", count);
    request.setAttribute("cntAllMaleStudents", cntAllMaleStudents);
    request.setAttribute("cntAllFeMaleStudents", cntAllFeMaleStudents);
    request.setAttribute("cntPassedStudents", cntPassedStudents);
    request.setAttribute("cntFaildedStudents", cntFaildedStudents);
    request.setAttribute("cntPassedMalesStudents", cntPassedMalesStudents);
    request.setAttribute("cntPassedFeMalesStudents", cntPassedFeMalesStudents);
    request.setAttribute("cntFailedMaleStduents", cntFailedMaleStduents);
    request.setAttribute("cntFailedFeMaleStduents", cntFailedFeMaleStduents);
    
    
    
    
    
   
    
    
    RequestDispatcher disp = request.getRequestDispatcher("stastics_Outcome.jsp");
    disp.forward(request, response);

    
        
    }

}
