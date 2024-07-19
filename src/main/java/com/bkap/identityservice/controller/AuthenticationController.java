package com.bkap.identityservice.controller;

import com.bkap.identityservice.dto.request.AuthenticationRequest;
import com.bkap.identityservice.dto.request.IntrospectRequest;
import com.bkap.identityservice.dto.request.LogoutRequest;
import com.bkap.identityservice.dto.request.RefreshRequest;
import com.bkap.identityservice.dto.response.ApiResponse;
import com.bkap.identityservice.dto.response.AuthenticationResponse;
import com.bkap.identityservice.dto.response.IntrospectResponse;
import com.bkap.identityservice.service.AuthenticationService;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.text.ParseException;

@RestController
@RequestMapping("/auth")
@RequiredArgsConstructor
public class AuthenticationController {

    private final AuthenticationService authenticationService;

    @PostMapping("/token")
    public ApiResponse<AuthenticationResponse> authenticate(@RequestBody AuthenticationRequest request) throws KeyLengthException {
       var result = authenticationService.authenticate(request);
       return ApiResponse.<AuthenticationResponse>builder()
               .result(result)
               .build();
    }

    @PostMapping("/introspect")
    public ApiResponse<IntrospectResponse> authenticate(@RequestBody IntrospectRequest request)
            throws JOSEException, ParseException {
        var result = authenticationService.introspect(request);
        return ApiResponse.<IntrospectResponse>builder()
                .result(result)
                .build();
    }

    @PostMapping("/refresh")
    public ApiResponse<AuthenticationResponse> authenticate(@RequestBody RefreshRequest request)
            throws JOSEException, ParseException {
        var result = authenticationService.refreshToken(request);
        return ApiResponse.<AuthenticationResponse>builder()
                .result(result)
                .build();
    }

    @PostMapping("/logout")
    public ApiResponse<Void> logout(@RequestBody LogoutRequest request)
            throws JOSEException, ParseException {
        authenticationService.logout(request);
        return ApiResponse.<Void>builder()
                .build();
    }

}
