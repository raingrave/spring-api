package com.raintech.api.Services;

import com.raintech.api.Entities.Repositories.UserRepository;
import com.raintech.api.Entities.User;
import com.raintech.api.Services.Contracts.UserServiceContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements UserServiceContract {
    @Autowired
    private UserRepository userRepository;

    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

    public User read(Long id) {
        return userRepository.findById(id).get();
    }

    public User create(User user) {
        userRepository.save(user);

        return user;
    }

    public void delete(Long id) {
        User user = userRepository.findById(id).get();

        userRepository.delete(user);
    }
}
