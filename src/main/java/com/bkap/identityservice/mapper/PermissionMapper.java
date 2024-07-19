package com.bkap.identityservice.mapper;

import com.bkap.identityservice.dto.request.PermissionRequest;
import com.bkap.identityservice.dto.request.UserCreationRequest;
import com.bkap.identityservice.dto.request.UserUpdateRequest;
import com.bkap.identityservice.dto.response.PermissionResponse;
import com.bkap.identityservice.dto.response.UserResponse;
import com.bkap.identityservice.entity.Permission;
import com.bkap.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface PermissionMapper {
    Permission toPermission(PermissionRequest request);
    PermissionResponse toPermissionResponse(Permission permission);
}
