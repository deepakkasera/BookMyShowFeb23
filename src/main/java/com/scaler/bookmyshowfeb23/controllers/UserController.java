package com.scaler.bookmyshowfeb23.controllers;

import com.scaler.bookmyshowfeb23.dtos.SignUpRequestDto;
import com.scaler.bookmyshowfeb23.dtos.SignUpResponseDto;
import com.scaler.bookmyshowfeb23.services.UserService;
import org.springframework.stereotype.Controller;

@Controller
public class UserController {
    private UserService userService;

    UserController(UserService userService) {
        this.userService = userService;
    }

    public SignUpResponseDto singUp(SignUpRequestDto requestDto) {
        SignUpResponseDto responseDto = new SignUpResponseDto();

        try {
            userService.
        }
    }
}
