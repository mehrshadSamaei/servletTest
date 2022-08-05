package ir.service;

import ir.domian.User;

import java.util.List;

public interface UserService {
    User save(User user);

    User update(User user);

    User findById(Long id);

    List<User> findAll();



}
