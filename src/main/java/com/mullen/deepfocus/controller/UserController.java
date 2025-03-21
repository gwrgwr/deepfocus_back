package com.mullen.deepfocus.controller;

import com.mullen.deepfocus.domain.user.UserEntity;
import com.mullen.deepfocus.services.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/v1/user")
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/{userId}")
    public ResponseEntity<UserEntity> findByUserId(@PathVariable String userId) {
        try {
            return ResponseEntity.ok(this.userService.findUserById(userId));
        } catch (Exception e) {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public void saveUser(@RequestBody UserEntity user) {
        this.userService.saveUser(user);
    }

    @PutMapping("/{userId}")
    public ResponseEntity setFirstTime(@PathVariable String userId) {
        this.userService.setIsFirstTime(userId);
        return ResponseEntity.ok().build();
    }
}
