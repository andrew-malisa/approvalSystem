package com.organization.organization.dto;

import java.util.Set;

public class OrganizationDTO {

    private Long id;
    private String name;
    private Long parentId;
    private Set<Long> childrenIds;

    // Default constructor
    public OrganizationDTO() {
    }

    // Parameterized constructor
    public OrganizationDTO(Long id, String name, Long parentId, Set<Long> childrenIds) {
        this.id = id;
        this.name = name;
        this.parentId = parentId;
        this.childrenIds = childrenIds;
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

    public Long getParentId() {
        return parentId;
    }

    public void setParentId(Long parentId) {
        this.parentId = parentId;
    }

    public Set<Long> getChildrenIds() {
        return childrenIds;
    }

    public void setChildrenIds(Set<Long> childrenIds) {
        this.childrenIds = childrenIds;
    }

    // toString method
    @Override
    public String toString() {
        return "OrganizationDTO{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", parentId=" + parentId +
                ", childrenIds=" + (childrenIds != null ? childrenIds.size() : "null") +
                '}';
    }
}
