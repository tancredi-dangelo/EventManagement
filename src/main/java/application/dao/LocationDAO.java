package application.dao;

import application.entities.Location;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class LocationDAO {

    // create factory
    public final EntityManagerFactory emf;

    // constructor
    public LocationDAO() {
        this.emf = Persistence.createEntityManagerFactory("event_management");
    }

    // save location
    public void saveLocation(Location location) {

        // create new entity manager
        EntityManager em = emf.createEntityManager();

        try {
            // create transaction
            EntityTransaction transaction = em.getTransaction();

            // begin transaction
            transaction.begin();

            // create persistence
            em.persist(location);

            // commit transaction
            transaction.commit();

        } catch(Exception e) {
            em.getTransaction().rollback();
            System.out.println(e.getMessage());

        } finally {
            // close entity manager
            em.close();
        }
    }

    // find events by locatio

}
