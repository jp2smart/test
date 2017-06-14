package boot.crud;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
 
 
public class StudentManagerUtil {
    
    private static final EntityManagerFactory entityManagerFactory;
      static {
        try {
          entityManagerFactory = Persistence.createEntityManagerFactory("studenttest");
          
 
        } catch (Throwable ex) {          
          throw new ExceptionInInitializerError(ex);
        }
      }
 
      public static EntityManager getEntityManager() {
        return entityManagerFactory.createEntityManager();
 
      }
    }
