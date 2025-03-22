package com.mullen.deepfocus.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDateTime;

@Document(collection = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private String id;

    private int userState = 1;

    private LocalDateTime createdAt = LocalDateTime.now();

    private boolean isFirstTime = true;

    public UserEntity(String id) {
        this.id = id;
    }
}
