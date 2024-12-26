package com.user.user.model;

import jakarta.persistence.*;

import javax.management.relation.Role;


@Entity
@Table(name = "users")

public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(unique = true, nullable = false)
    private String username;

    @Column(nullable = false)
    private String Password;

    @Column(nullable = false)
    private String Role;

    //Getter ve setter methodları ekleme

    public Long getId()
    {
        return id;
    }

    public void setId(Long id)
    {
        this.id =  id;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username =  username;
    }

    public String getPassword()
    {
        return Password;
    }

    public void setPassword(String password)
    {
        this.Password =  password;
    }

    public String getRole()
    {
        return Role;
    }

    public void setRole(String Role)
    {
        this.Role =  Role;
    }

}

