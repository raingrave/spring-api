package com.raintech.api.Services.Contracts;

import com.raintech.api.Entities.User;

public interface UserServiceContract {
    public Iterable<User> getAll();
    public User create(User user);
    public User read(Long id);
//    public User update(Long id, User user);
    public void delete(Long id);
}
