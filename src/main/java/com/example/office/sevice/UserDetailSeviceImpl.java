package com.example.office.sevice;

import com.example.office.config.UserDetailConfig;
import com.example.office.model.UserEntity;
import com.example.office.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailSeviceImpl implements UserDetailsService {
    @Autowired
    UserRepository userRepository;

    @Override
    public UserDetails loadUserByUsername(String acount) throws UsernameNotFoundException {

        UserEntity user = userRepository.findAllByAcount(acount);
        if (user != null)
            return new UserDetailConfig(user);
        return null;
    }
}
