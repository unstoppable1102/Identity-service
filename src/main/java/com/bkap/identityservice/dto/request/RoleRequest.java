package com.bkap.identityservice.dto.request;

import lombok.*;

import java.util.Set;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class RoleRequest {

    private String name;
    private String description;
    private Set<String> permissions;


}
