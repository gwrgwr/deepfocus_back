package com.mullen.deepfocus.domain.session;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "sessions")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class SessionEntity {
    @Id
    private String id;

    private String userId;

    private String sessionDate;

    private String sessionType;

    private String sessionDuration;

    private String sessionStatus;

    private String sessionTime;
}
