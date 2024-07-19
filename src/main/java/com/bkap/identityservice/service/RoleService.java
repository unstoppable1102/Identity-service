package com.bkap.identityservice.service;

import com.bkap.identityservice.dto.request.RoleRequest;
import com.bkap.identityservice.dto.response.RoleResponse;

import java.util.List;

public interface RoleService {
    RoleResponse create(RoleRequest request);
    List<RoleResponse> getAll();
    void delete(String role);
}
