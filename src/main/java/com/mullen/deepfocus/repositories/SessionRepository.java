package com.mullen.deepfocus.repositories;

import com.mullen.deepfocus.domain.session.SessionEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
public interface SessionRepository extends MongoRepository<SessionEntity, String> {}
