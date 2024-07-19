package com.bkap.identityservice.service;

import com.bkap.identityservice.dto.request.AuthenticationRequest;
import com.bkap.identityservice.dto.request.IntrospectRequest;
import com.bkap.identityservice.dto.request.LogoutRequest;
import com.bkap.identityservice.dto.request.RefreshRequest;
import com.bkap.identityservice.dto.response.AuthenticationResponse;
import com.bkap.identityservice.dto.response.IntrospectResponse;
import com.nimbusds.jose.JOSEException;
import com.nimbusds.jose.KeyLengthException;

import java.text.ParseException;

public interface AuthenticationService {
    AuthenticationResponse authenticate(AuthenticationRequest request) throws KeyLengthException;
    IntrospectResponse introspect(IntrospectRequest request) throws JOSEException, ParseException;
    void logout(LogoutRequest request) throws ParseException, JOSEException;
    AuthenticationResponse refreshToken(RefreshRequest request) throws ParseException, JOSEException;

}
