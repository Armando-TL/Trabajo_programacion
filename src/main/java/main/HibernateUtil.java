package main;
// @author armando

import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;


public class HibernateUtil {
   
    private static final EntityManagerFactory entityManagerFactory;

    static {
        try {
            // Configura JPA desde el archivo persistence.xml
            entityManagerFactory = Persistence.createEntityManagerFactory("PESISTENCIA");
        } catch (Throwable ex) {
            throw new RuntimeException(ex);
        }
    }

    public static EntityManagerFactory getEntityManagerFactory() {
        return entityManagerFactory;
    }
}
