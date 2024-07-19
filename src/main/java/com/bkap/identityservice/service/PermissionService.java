package com.bkap.identityservice.service;

import com.bkap.identityservice.dto.request.PermissionRequest;
import com.bkap.identityservice.dto.response.PermissionResponse;

import java.util.List;

public interface PermissionService {
    PermissionResponse create(PermissionRequest request);
    List<PermissionResponse> getAll();
    void delete(String permission);
}
