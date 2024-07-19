package com.bkap.identityservice.service;

import com.bkap.identityservice.dto.request.UserCreationRequest;
import com.bkap.identityservice.dto.request.UserUpdateRequest;
import com.bkap.identityservice.dto.response.UserResponse;
import com.bkap.identityservice.entity.User;

import java.util.List;

public interface UserService {
    UserResponse createUser(UserCreationRequest request);
    List<UserResponse> getUsers();
    UserResponse getUser(String id);
    UserResponse updateUser(String userId, UserUpdateRequest request);
    UserResponse getMyInfo();
    void deleteUser(String userId);
}
