package com.example.mohandesinarm.Auth;


import com.example.mohandesinarm.Config.JwtService;
import com.example.mohandesinarm.DBEntity.UsersEntity;
import com.example.mohandesinarm.Repository.UsersRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.time.ZonedDateTime;
import java.util.Calendar;

@Service
@RequiredArgsConstructor
public class AuthenticationService {

    private final UsersRepository repository;
    private final PasswordEncoder passwordEncoder;
    private final JwtService jwtService;
    private final AuthenticationManager authenticationManager;

    public AuthenticationResponse register(RegisterRequest request) {
        var user = UsersEntity.builder()
                .firstName(request.getFirstname())
                .lastName(request.getLastname())
                .emailAddress(request.getEmail())
                .password(passwordEncoder.encode(request.getPassword()))
                .birthdate( request.getBirthdate())
                .isActive(true)
                .cardNumber(request.getCardNumber())
                .createAt(new java.sql.Date(Calendar.getInstance().getTime().getTime()))
                .phoneNumber(request.getPhoneNumber())
                .build();
        try {
            repository.save(user);
        }catch (DataIntegrityViolationException error){
            return AuthenticationResponse.builder()
                    .status("You have already registered.")
                    .build();
        }
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .phoneNumber(request.getPhoneNumber())
                .firstname(request.getFirstname())
                .lastname(request.getLastname())
                .emailAddress(request.getEmail())
                .status("Registration was done successfully.")
                .build();
    }

    public AuthenticationResponse authenticate(AuthenticationRequest request) {
        try {
            authenticationManager.authenticate(
                    new UsernamePasswordAuthenticationToken(
                            request.getEmail(),
                            request.getPassword()
                    )
            );
        }catch (Exception error){
            return AuthenticationResponse.builder()
                    .status("Username or password incorrect.")
                    .build();
        }
        var user = repository.findByEmailAddress(request.getEmail())
                .orElseThrow();
        var jwtToken = jwtService.generateToken(user);
        return AuthenticationResponse.builder()
                .token(jwtToken)
                .phoneNumber(user.phoneNumber)
                .firstname(user.firstName)
                .lastname(user.lastName)
                .emailAddress(user.emailAddress)
                .status("Login successfully.")
                .build();
    }
}
