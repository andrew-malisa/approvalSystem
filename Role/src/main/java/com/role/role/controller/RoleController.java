package com.role.role.controller;

import com.role.role.model.Role;
import com.role.role.service.RoleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/roles")
public class RoleController {

    @Autowired
    private RoleService roleService;

    // Tüm Rolleri Getir
    @GetMapping
    public List<Role> getAllRoles() {
        return roleService.getAllRoles(); // Service'ten tüm rolleri alıyoruz
    }

    // ID'ye göre Rolü Getir
    @GetMapping("/{id}")
    public Role getRoleById(@PathVariable Long id) {
        return roleService.getRoleById(id); // Service'ten ID'ye göre rolü alıyoruz
    }
}
