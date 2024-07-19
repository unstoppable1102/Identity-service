package com.bkap.identityservice.service.impl;

import com.bkap.identityservice.dto.request.RoleRequest;
import com.bkap.identityservice.dto.response.RoleResponse;
import com.bkap.identityservice.mapper.RoleMapper;
import com.bkap.identityservice.repository.PermissionRepository;
import com.bkap.identityservice.repository.RoleRepository;
import com.bkap.identityservice.service.RoleService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class RoleServiceImpl implements RoleService {

    private final RoleRepository roleRepository;
    private final RoleMapper roleMapper;
    private final PermissionRepository permissionRepository;

    @Override
    public RoleResponse create(RoleRequest request) {
        var role = roleMapper.toRole(request);

        var permissions = permissionRepository.findAllById(request.getPermissions());
        role.setPermissions(new HashSet<>(permissions));

        role = roleRepository.save(role);
        return roleMapper.toRoleResponse(role);
    }


    @Override
    public List<RoleResponse> getAll() {

        var roles = roleRepository.findAll();
        return roles
                .stream()
                .map(roleMapper::toRoleResponse)
                .toList();

    }

    @Override
    public void delete(String role) {
        roleRepository.deleteById(role);
    }
}
