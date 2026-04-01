package com.jayson.socialfeed.service;

import com.jayson.socialfeed.model.User;
import com.jayson.socialfeed.repository.UserRepository;
import org.springframework.stereotype.Service;
// import org.springframework.stereotype.service;

@Service
public class UserService {

    private final UserRepository userRepository;

    public UserService(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    public User register(User user) {

        return userRepository.save(user);
    }
}