package com.scaler.bookmyshowfeb23.services;

import com.scaler.bookmyshowfeb23.models.User;
import com.scaler.bookmyshowfeb23.repositories.UserRepository;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class UserService {
    private UserRepository userRepository;

    UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User signUp(String email, String password) {
        Optional<User> optionalUser = userRepository.findAllByEmail(email);

        if (optionalUser.isPresent()) {
            //Call the Login method.
        }
        //Create and register the user.

        User user = new User();
        user.setEmail(email);
        user.setPassword(password);
        User savedUser = userRepository.save(user);

        return savedUser;
    }

    public User signIn(String email, String password) {
        //Implement the signIn workflow;
        return null;
    }
}
