package com.organization.organization.model;

import jakarta.persistence.*;

import java.util.Objects;
import java.util.Set;

@Entity
public class Organization {

    @Id
    private Long id;
    private String name;

    @ManyToOne
    private Organization parent;

    @OneToMany(mappedBy = "parent")
    private Set<Organization> children;

    // Default constructor
    public Organization() {
    }

    // Parameterized constructor
    public Organization(Long id, String name, Organization parent, Set<Organization> children) {
        this.id = id;
        this.name = name;
        this.parent = parent;
        this.children = children;
    }

    // Getters and Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Organization getParent() {
        return parent;
    }

    public void setParent(Organization parent) {
        this.parent = parent;
    }

    public Set<Organization> getChildren() {
        return children;
    }

    public void setChildren(Set<Organization> children) {
        this.children = children;
    }

    // equals and hashCode

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Organization that = (Organization) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    // toString method

    @Override
    public String toString() {
        return "Organization{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parent=" + (parent != null ? parent.getName() : "null") +
                ", children=" + (children != null ? children.size() : "null") +
                '}';
    }
}
