/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Local;
import za.ac.tut.entity.Student;

/**
 *
 * @author kesao
 */
@Local
public interface StudentFacadeLocal {

    void create(Student student);

    void edit(Student student);

    void remove(Student student);

    Student find(Object id);
    Student find(String firstName, String lastName);
    List<Student> findAll();
    
    Integer cntAllMaleStudents();
    Integer cntAllFeMaleStudents();
    
    Integer cntPassedStudents();
    Integer cntFaildedStudents();
    
    Integer cntPassedMalesStudents();
    Integer cntPassedFeMalesStudents();
    
    Integer cntFailedMaleStduents();
    Integer cntFailedFeMaleStduents();
    
    
    
  List<Student> findRangeWithinAge(Integer minAge, Integer maxAge);
  List<Student> findRange(int[] range);
    
    
    Double getHighestMark();
    Double getLowestMark();
    Double getAvgMark();
    
    

    int count();
    
}
