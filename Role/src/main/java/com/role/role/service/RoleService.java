package com.role.role.service;

import com.role.role.model.Role;
import com.role.role.repository.RoleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class RoleService {

    @Autowired
    private RoleRepository roleRepository;

    // Tüm Rolleri Getir
    public List<Role> getAllRoles() {
        return roleRepository.findAll(); // Veritabanındaki tüm rolleri getir
    }

    // ID'ye göre Rolü Getir
    public Role getRoleById(Long id) {
        Optional<Role> role = roleRepository.findById(id); // Veritabanında ID'ye göre rolü ara
        return role.orElse(null); // Eğer rol bulunursa döner, bulunmazsa null döner
    }

}
