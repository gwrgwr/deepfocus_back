package com.mullen.deepfocus.domain.user;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserEntity {
    private String id;

    private String sessionId;

    private boolean isFirstTime = false;

    public UserEntity(String id, String sessionId) {
        this.id = id;
        this.sessionId = sessionId;
    }
}
