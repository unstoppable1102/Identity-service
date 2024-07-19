package com.bkap.identityservice.mapper;

import com.bkap.identityservice.dto.request.PermissionRequest;
import com.bkap.identityservice.dto.request.RoleRequest;
import com.bkap.identityservice.dto.response.PermissionResponse;
import com.bkap.identityservice.dto.response.RoleResponse;
import com.bkap.identityservice.entity.Permission;
import com.bkap.identityservice.entity.Role;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

@Mapper(componentModel = "spring")
public interface RoleMapper {
    @Mapping(target = "permissions", ignore = true)
    Role toRole(RoleRequest request);
    RoleResponse toRoleResponse(Role role);
}
