package com.mullen.deepfocus.services;

import com.mullen.deepfocus.domain.user.UserEntity;
import com.mullen.deepfocus.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public UserEntity saveUser(UserEntity user) {
        return userRepository.save(user);
    }

    public UserEntity findUserById(String userId) {
        return this.userRepository.findById(userId).orElseThrow(()-> new RuntimeException("User not found"));
    }

    public void setIsFirstTime(String userId) {
        UserEntity user = this.findUserById(userId);
        user.setFirstTime(false);
        this.userRepository.save(user);
    }


}
