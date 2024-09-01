package com.example.fitnessuserapp.service.impl;

import com.example.fitnessuserapp.dto.UserDTO;
import com.example.fitnessuserapp.entity.User;
import com.example.fitnessuserapp.repository.UserRepository;
import com.example.fitnessuserapp.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class UserServiceImpl implements UserService {
    private final UserRepository userRepository;

    @Override
    public void crateUser(UserDTO userDTO) {
        User user = new User();
        user.setUserName(userDTO.getUsername());

        userRepository.save(user);
    }
}
