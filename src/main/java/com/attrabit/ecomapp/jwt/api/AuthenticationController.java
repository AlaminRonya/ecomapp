package com.attrabit.ecomapp.jwt.api;


import com.attrabit.ecomapp.jwt.dto.AuthenticationRequest;
import com.attrabit.ecomapp.jwt.dto.RegisterRequest;
import com.attrabit.ecomapp.jwt.interfaces.AuthenticationApi;
import com.attrabit.ecomapp.jwt.service.AuthenticationService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class AuthenticationController implements AuthenticationApi {
    private final AuthenticationService authenticationService;

    @Override
    public ResponseEntity<?> register(RegisterRequest dto) {
        return new ResponseEntity<>(authenticationService.register(dto), HttpStatus.CREATED);
    }

    @Override
    public ResponseEntity<?> authenticate(AuthenticationRequest dto) {
        return new ResponseEntity<>(authenticationService.authenticate(dto), HttpStatus.CREATED);
    }
}
