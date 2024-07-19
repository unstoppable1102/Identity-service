package com.bkap.identityservice.mapper;

import com.bkap.identityservice.dto.request.UserCreationRequest;
import com.bkap.identityservice.dto.request.UserUpdateRequest;
import com.bkap.identityservice.dto.response.UserResponse;
import com.bkap.identityservice.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.MappingTarget;

@Mapper(componentModel = "spring")
public interface UserMapper {
    User toUser(UserCreationRequest request);

    @Mapping(target = "roles", ignore = true)
    void updateUser(@MappingTarget User user, UserUpdateRequest request);

    UserResponse toUserResponse(User user);
}
