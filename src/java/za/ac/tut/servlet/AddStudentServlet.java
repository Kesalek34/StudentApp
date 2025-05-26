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
public class AddStudentServlet extends HttpServlet {
@EJB StudentFacadeLocal cfl;
   
   
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
       Long id = Long.parseLong(request.getParameter("id"));
    
   String firstName = request.getParameter("firstName") ;
    String lastName = request.getParameter("lastName");
     String gender = request.getParameter("gender");
     
    Integer age = Integer.parseInt(request.getParameter("age"));
    
  Double perMark = Double.parseDouble(request.getParameter("perMark"));
  
  
  
  Student students = createStudent(id,firstName,lastName,gender,age,perMark);
  cfl.createStudent(students);
  request.setAttribute("students", students);
  
  
  
  RequestDispatcher disp = request.getRequestDispatcher("add_Outcome.jsp");
  disp.forward(request, response);
  
  
        
    }

    private Student createStudent(Long id, String firstName, String lastName, String gender, Integer age, Double perMark) {
     Student students = new Student();
     students.setId(id);
     students.setFirstName(firstName);
     students.setLastName(lastName);
     students.setGender(gender);
     students.setAge(age);
     students.setPerMark(perMark);
     
     return students;

}
}
