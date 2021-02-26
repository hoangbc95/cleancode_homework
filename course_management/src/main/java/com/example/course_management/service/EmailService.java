package com.example.course_management.service;

import com.example.course_management.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class EmailService {
    private final UserRepository userRepository;

    @Transactional(readOnly = true)
    public boolean checkExistEmail(String email) {
        return userRepository.existsEmailByEmail(email);
    }
}

