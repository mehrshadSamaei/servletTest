package ir.service;

import ir.domian.User;
import ir.repository.UserRepository;

import java.util.List;

public class UserServiceImpl implements UserService {
    protected UserRepository repository;

    public UserServiceImpl(UserRepository userRepository) {
        this.repository = userRepository;
    }

    @Override
    public User save(User user) {

        try {
            repository.beginTransaction();
            User saveUser = repository.save(user);
            repository.commitTransaction();
            return saveUser;
        }catch (Exception e){
            repository.rollBackTransaction();
        }
       return  null;
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
        return repository.findAll();
    }
}
