package com.dreamteam.metro_chat.service;

import com.dreamteam.metro_chat.models.User;
import com.dreamteam.metro_chat.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    private final UserRepository userRepository;


    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User getUserRepository(User user) {
        return userRepository.save(user);
    }
}
