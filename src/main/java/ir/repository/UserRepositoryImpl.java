package ir.repository;

import ir.domian.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public class UserRepositoryImpl implements UserRepository {
    protected final EntityManager em;

    public UserRepositoryImpl(EntityManager em) {
        this.em = em;
    }

    @Override
    public User save(User user) {
        em.persist(user);
        return user;
    }

    @Override
    public User update(User user) {
        return null;
    }

    @Override
    public User findById(Long id) {
        return null;
    }

    @Override
    public List<User> findAll() {
        return em.createQuery("select u from User u", User.class).getResultList();
    }

    @Override
    public void deleteById(Long id) {

    }

    @Override
    public EntityTransaction getTransaction() {
        return em.getTransaction();
    }

    @Override
    public void beginTransaction() {
        if (!getTransaction().isActive())
            getTransaction().begin();
    }

    @Override
    public void commitTransaction() {
        if (getTransaction().isActive())
            getTransaction().commit();
    }

    @Override
    public void rollBackTransaction() {
        getTransaction().rollback();
    }
}
