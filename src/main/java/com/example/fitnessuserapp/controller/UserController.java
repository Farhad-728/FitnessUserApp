package com.example.fitnessuserapp.controller;

import com.example.fitnessuserapp.dto.UserDTO;
import com.example.fitnessuserapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("/v1/users")
public class UserController {
    private final UserService userService;

    @PostMapping(value = "/save")
    public void crateUser(@RequestBody UserDTO userDTO) {
        userService.crateUser(userDTO);
    }
}
