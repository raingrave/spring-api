package com.raintech.api.Controllers;

import com.raintech.api.Entities.User;
import com.raintech.api.Services.Contracts.UserServiceContract;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/users")
public class UserController {
    @Autowired
    private UserServiceContract userService;

    @GetMapping
    public Iterable<User> getAll() {
        return userService.getAll();
    }

    @PostMapping
    public User create(@RequestBody User user) {
        userService.create(user);

        return user;
    }

    @GetMapping("/{id}")
    public User read(@PathVariable Long id) {
        return userService.read(id);
    }

//    @PutMapping("/{id}")
//    public User update(@PathVariable Long id, @RequestBody User user) {
//        return user;
//    }
//
    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        userService.delete(id);
    }
}
