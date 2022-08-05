package ir.repository;

import ir.domian.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityTransaction;

import java.util.List;

public interface UserRepository {

    User save(User user);

    User update(User user);

    User findById(Long id);

    List<User> findAll();

    void deleteById(Long id);

    EntityTransaction getTransaction();

    void beginTransaction();

    void commitTransaction();

    void rollBackTransaction();
}
