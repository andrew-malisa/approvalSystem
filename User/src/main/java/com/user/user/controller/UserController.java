package com.user.user.controller;

import com.user.user.dtb.UserDTO;
import com.user.user.model.User;
import com.user.user.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping
    public List<User> getAllUsers() {
        return userService.getAllUsers();
    }

    @GetMapping("/{id}")
    public User getUserById(@PathVariable Long id) {
        return userService.getUserById(id);
    }

    @PostMapping
    public User createUser(@RequestBody @Valid UserDTO userDTO) {
        User user = new User();
        user.setUsername(userDTO.getusername());
        user.setPassword(userDTO.getPassword());
        user.setRole(userDTO.getRole());
        return userService.createUser(user);
    }

    // Güncellenmiş Update Metodu
    @PutMapping("/{id}")
    public User updateUser(@PathVariable Long id, @RequestBody @Valid UserDTO userDTO) {
        User userDetails = new User();
        userDetails.setUsername(userDTO.getusername());
        userDetails.setPassword(userDTO.getPassword());
        userDetails.setRole(userDTO.getRole());
        return userService.updateUser(id, userDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteUser(@PathVariable Long id) {
        userService.deleteUser(id);
    }
}
