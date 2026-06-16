package application.databases;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class CheckDatabaseConnection {

    public static void checkDatabaseConnection() {
        try {
            EntityManagerFactory emf =
                    Persistence.createEntityManagerFactory("event_management");

            EntityManager em = emf.createEntityManager();

            System.out.println("✅ Database connection successful!");

            em.close();
            emf.close();

        } catch (Exception e) {
            System.out.println("❌ Database connection failed!");
        }
    }
}