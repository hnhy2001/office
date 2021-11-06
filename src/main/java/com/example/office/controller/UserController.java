package com.example.office.controller;

import com.example.office.model.UserEntity;
import com.example.office.request.CreateUserRequest;
import com.example.office.request.LoginRequest;
import com.example.office.response.LoginResponse;
import com.example.office.sevice.UserSevice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {

    @Autowired
    UserSevice userSevice;


    @GetMapping("/findall")
    @PreAuthorize("hasAnyAuthority('admin','user')")
    public ResponseEntity<List<UserEntity>> getAllUser(){
        return new ResponseEntity<>(userSevice.getAllUser(), HttpStatus.OK);
    }

    @PostMapping("/create")
    @PreAuthorize("hasAuthority('admin')")
    public ResponseEntity<UserEntity> createUser(@RequestBody CreateUserRequest createUserRequest){
        return new ResponseEntity<>(userSevice.createUser(createUserRequest),HttpStatus.OK);
    }

    @PostMapping("/login")
    public ResponseEntity<LoginResponse> login(@RequestBody LoginRequest loginRequest){
        return new ResponseEntity<>(userSevice.login(loginRequest),HttpStatus.OK);
    }
}
