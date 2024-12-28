package com.groupservice.groupservice.service;

import com.groupservice.groupservice.dto.GroupDto;
import com.groupservice.groupservice.model.Group;
import com.groupservice.groupservice.repository.GroupRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GroupService {

    private final GroupRepository groupRepository;

    @Autowired
    public GroupService(GroupRepository groupRepository) {
        this.groupRepository = groupRepository;
    }

    public List<GroupDto> getAllGroups() {
        return groupRepository.findAll().stream().map(group -> {
            GroupDto dto = new GroupDto();
            dto.setId(group.getId());
            dto.setName(group.getName());
            dto.setPermissionIds(group.getPermissionIds());
            return dto;
        }).collect(Collectors.toList());
    }

    public GroupDto createGroup(GroupDto groupDTO) {
        Group group = new Group();
        group.setName(groupDTO.getName());
        group.setPermissionIds(groupDTO.getPermissionIds());
        Group savedGroup = groupRepository.save(group);
        groupDTO.setId(savedGroup.getId());
        return groupDTO;
    }

    public GroupDto getGroupById(Long id) {
        return groupRepository.findById(id).map(group -> {
            GroupDto dto = new GroupDto();
            dto.setId(group.getId());
            dto.setName(group.getName());
            dto.setPermissionIds(group.getPermissionIds());
            return dto;
        }).orElseThrow(() -> new RuntimeException("Group not found"));
    }

    public void deleteGroup(Long id) {
        groupRepository.deleteById(id);
    }

    public void addPermissionsToGroup(Long groupId, List<Long> permissionIds) {

    }
}
