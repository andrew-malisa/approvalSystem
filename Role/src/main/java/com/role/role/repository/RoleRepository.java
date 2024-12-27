package com.role.role.repository;

import com.role.role.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoleRepository extends JpaRepository<Role, Long> {
    // Rol ismine göre rol arama
    Optional<Role> findByName(String name);

    // Rol id'sine göre rol arama
    Optional<Role> findById(Long id);
}
