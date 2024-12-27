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

    // Tüm rolleri getir
    public List<Role> getAllRoles() {
        return roleRepository.findAll();
    }

    // ID'ye göre rolü getir
    public Role getRoleById(Long id) {
        Optional<Role> role = roleRepository.findById(id);
        return role.orElse(null); // Eğer rol bulunmazsa null döner
    }
}
