package com.mullen.deepfocus.services;

import com.mullen.deepfocus.domain.session.SessionEntity;
import com.mullen.deepfocus.repositories.SessionRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SessionService {
    final private SessionRepository sessionRepository;

    public SessionService(SessionRepository sessionRepository) {
        this.sessionRepository = sessionRepository;
    }

    public SessionEntity save(SessionEntity sessionEntity) {
        return sessionRepository.save(sessionEntity);
    }

    public SessionEntity findById(String id) {
        return sessionRepository.findById(id).orElse(null);
    }

    public List<SessionEntity> findAll() {
        return sessionRepository.findAll();
    }

    public void deleteById(String id) {
        sessionRepository.deleteById(id);
    }
}
