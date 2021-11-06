package com.example.office.sevice;

import com.example.office.jwt.JWTProvider;
import com.example.office.model.UserEntity;
import com.example.office.repository.UserRepository;
import com.example.office.request.CreateUserRequest;
import com.example.office.request.LoginRequest;
import com.example.office.response.LoginResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserSevice {
    @Autowired
    UserRepository userRepository;

    @Autowired
    JWTProvider jwtProvider;

    public List<UserEntity> getAllUser(){
        return userRepository.findAll();
    }

    public UserEntity createUser(CreateUserRequest createUserRequest){
        UserEntity userEntity = new UserEntity();
        userEntity.setName(createUserRequest.getName());
        userEntity.setAcount(createUserRequest.getAcount());
        userEntity.setPassword(createUserRequest.getPassword());
        userEntity.setRole(createUserRequest.getRole());
        userRepository.save(userEntity);
        return userEntity;
    }

    public LoginResponse login(LoginRequest loginRequest){
        UserEntity userEntity = userRepository.findAllByAcountAndPassword(loginRequest.getAcount(), loginRequest.getPassword());
        if (userEntity == null){
            return null;
        }

        String token = jwtProvider.generateToken(userEntity);
        LoginResponse loginResponse = new LoginResponse(token);
        return loginResponse;
    }


}
