/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package za.ac.tut.bl;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import za.ac.tut.entity.Student;

/**
 *
 * @author kesao
 */
@Stateless
public class StudentFacade extends AbstractFacade<Student> implements StudentFacadeLocal {

    @PersistenceContext(unitName = "TechEJBModulePU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public StudentFacade() {
        super(Student.class);
    }

    @Override
    public Integer cntAllMaleStudents() {
    Query query = em.createQuery("SELECT count(c) FROM Student c WHERE c.gender = 'M' ");
    Integer cnt = (Integer)query.getSingleResult();
    return cnt;
    }

    @Override
    public Integer cntAllFeMaleStudents() {
      Query query = em.createQuery("SELECT count(c) FROM Student c WHERE c.gender = 'F' ");
      Integer cnt = (Integer)query.getSingleResult();
      return cnt;
    }

    @Override
    public Integer cntPassedStudents() {
    Query query = em.createQuery("SELECT count(c) FROM Student c WHERE c.perMark >= 50.0");
    Integer cnt = (Integer)query.getSingleResult();
    return cnt;
    }

    @Override
    public Integer cntFaildedStudents() {
    Query query = em.createQuery("SELECT count(c) FROM Student c WHERE c.perMark < 50.0");
    Integer cnt = (Integer)query.getSingleResult();
    return cnt;
    }

    @Override
    public Integer cntPassedMalesStudents() {
    Query query = em.createQuery("SELECT count(c) FROM Student c WHERE c.gender = 'M' AND c.perMark >= 50.0");
    Integer cnt = (Integer)query.getSingleResult();
    return cnt;
    }

    @Override
    public Integer cntPassedFeMalesStudents() {
    Query query = em.createQuery("SELECT count(c) FROM Student c WHERE c.gender = 'F' AND c.perMark >= 50.0");
    Integer cnt = (Integer)query.getSingleResult();
    return cnt;
    }

    @Override
    public Integer cntFailedMaleStduents() {
    Query query = em.createQuery("SELECT count(c) FROM Student c WHERE c.gender = 'M' AND c.perMark < 50.0");
    Integer cnt = (Integer)query.getSingleResult();
    return cnt;
    }

    @Override
    public Integer cntFailedFeMaleStduents() {
    Query query = em.createQuery("SELECT count(c) FROM Student c WHERE c.gender = 'F' AND c.perMark < 50.0");
    Integer cnt = (Integer)query.getSingleResult();
    return cnt;
    
    }

    @Override
    public List<Student> findRangeWithinAge(Integer minAge, Integer maxAge) {
    Query query = em.createQuery("SELECT c FROM Student c WHERE c.age >= :minTargetAge AND c.age <= :maxTargetAge" );
    query.setParameter("minTargetAge", minAge);
    query.setParameter("maxTargetAge", maxAge);
    List<Student> students = query.getResultList();
    return students;
        
    }

    @Override
    public Double getHighestMark() {
    Query query = em.createQuery("SELECT MAX(c.perMark) FROM Student c");
    Double maxMark = (Double)query.getSingleResult();
    return maxMark;
    
    }

    @Override
    public Double getLowestMark() {
    Query query = em.createQuery("SELECT MIN(c.perMark) FROM Student c");
    Double minMark = (Double)query.getSingleResult();
    return minMark;
    }

    @Override
    public Double getAvgMark() {
    Query query = em.createQuery("SELECT AVG(c.perMark) FROM Student c");
    Double avgMark = (Double)query.getSingleResult();
    return avgMark;
        
    }

    @Override
    public Student find(String firstName, String lastName) {
    Query query = em.createQuery("SELECT c FROM Student c WHERE c.firstName = :fname AND c.lastName = :lname");
    query.setParameter("fname", firstName);
    query.setParameter("lname", lastName);
    Student student = (Student)query.getSingleResult();
    return student;
    }
    
}
