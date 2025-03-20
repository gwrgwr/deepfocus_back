package com.mullen.deepfocus.repositories;

import com.mullen.deepfocus.domain.user.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends MongoRepository<UserEntity, String> {}
