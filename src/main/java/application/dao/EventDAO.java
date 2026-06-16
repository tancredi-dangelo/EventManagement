package application.dao;

import application.entities.Event;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import java.util.UUID;

public class EventDAO {

    // create entity manager factory
    public final EntityManagerFactory emf;

    // constructor
    public EventDAO() {
        this.emf = Persistence.createEntityManagerFactory("event_management");
    }

    // save event
    public void save(Event event) {
        // create new entity manager
        EntityManager em = emf.createEntityManager();

        try {
            // init transaction
            EntityTransaction transaction = em.getTransaction();

            // begin transaction
            transaction.begin();

            // perform persistence on event
            em.persist(event);

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

    // find event by id
    public Event findById(UUID id) {

        EntityManager em = emf.createEntityManager();

        try {
            return em.find(Event.class, id);
        } catch (Exception ex) {
            System.out.println(ex.getMessage());
            return null;
        } finally {
            em.close();
        }
    }

    // delete event
    public void deleteEvent(UUID id) {
        EntityManager em = emf.createEntityManager();

        try {
            // init transaction
            EntityTransaction transaction = em.getTransaction();

            // begin transaction
            transaction.begin();

            // find event with id
            Event eventToDelete = findById(id);

            // remove event found
            if (eventToDelete != null) {
                em.remove(eventToDelete);
            }

            // commit transaction
            transaction.commit();

        } catch (Exception ex) {
            System.out.println(ex.getMessage());

        } finally {
            em.close();
        }
    }


    // close the factory
    public void close() {
        emf.close();
    }

}
