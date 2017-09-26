
package Corser_TOBA;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class DBUtil {
    private static final EntityManagerFactory emf =
            Persistence.createEntityManagerFactory("TOBA_Titan_Onliine_Banking_ApplicationPU");  


public static EntityManagerFactory getEmFactory() {
return emf;


       }

}