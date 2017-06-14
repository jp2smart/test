package boot.crud;

import javax.persistence.EntityManager;

import org.springframework.stereotype.Repository;

@Repository
public class StudentDAOImpl implements StudentDAO {
	
    public Student get(int empId){
        
        EntityManager entityManager = null;
        Student student=null;
        
        try{
            entityManager = StudentManagerUtil.getEntityManager();
            student = (Student)entityManager.find(Student.class, empId);
            
        }catch(Exception e){
            e.printStackTrace();
        }                
        return student;
    }
    
    
    public void insert(Student student){
        
        EntityManager entityManager = null;
        
        try {
            
            entityManager= StudentManagerUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.persist(student);
            entityManager.getTransaction().commit();
            
        }catch (Exception e){
            e.printStackTrace();
        }        
    }
    
    
  public void update(Student student){
        
      EntityManager entityManager = null;
        
        try {            
            entityManager= StudentManagerUtil.getEntityManager();
            entityManager.getTransaction().begin();
            entityManager.merge(student);
            entityManager.getTransaction().commit();
            
        }catch (Exception e){
            e.printStackTrace();
        }        
    }
  
  
  public void delete(Integer empId){
        
      EntityManager entityManager = null;
 
        
        try {
            
            entityManager= StudentManagerUtil.getEntityManager();
            entityManager.getTransaction().begin();
            Student emp = (Student)entityManager.find(Student.class, empId);
            entityManager.remove(emp);
            entityManager.getTransaction().commit();
            
        }catch (Exception e){
            e.printStackTrace();
        }        
    }





}
 
