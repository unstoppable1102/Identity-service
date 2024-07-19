package com.bkap.identityservice.dto.request;

import lombok.*;

@Getter
@Setter
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class LogoutRequest {

    private String token;

}
