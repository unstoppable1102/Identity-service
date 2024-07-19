package com.bkap.identityservice.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class AuthenticationRequest {

    private String username;
    private String password;
}
