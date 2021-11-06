package com.example.office.repository;

import com.example.office.model.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface UserRepository extends JpaRepository<UserEntity,Integer> {
    @Override
    List<UserEntity> findAll();

    UserEntity findAllByAcountAndPassword(String acount, String pass);

    UserEntity findAllByAcount(String acount);
}
