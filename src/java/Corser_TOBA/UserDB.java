package Corser_TOBA;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;



public class UserDB {
    public static void insert(User user){
    EntityManager em = DBUtil.getEmFactory().createEntityManager();
    EntityTransaction trans = em.getTransaction();
    
    trans.begin();
    
    
    
    try {
        em.persist (user);
        trans.commit();
    } catch (Exception e){
        System.out.println(e);
        trans.rollback();
    }   finally {
          em.close();
    }
    
    
    
    
    
    
    
    }
    
    
    
    
}
