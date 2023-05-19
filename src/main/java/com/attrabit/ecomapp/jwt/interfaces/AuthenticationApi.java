package com.attrabit.ecomapp.jwt.interfaces;

import com.attrabit.ecomapp.jwt.dto.AuthenticationRequest;
import com.attrabit.ecomapp.jwt.dto.RegisterRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/v1/auth")
public interface AuthenticationApi {
    @PostMapping("/register")
    ResponseEntity<?> register(@RequestBody RegisterRequest dto);
    @PostMapping("/authenticate")
    ResponseEntity<?> authenticate(@RequestBody AuthenticationRequest dto);
}
