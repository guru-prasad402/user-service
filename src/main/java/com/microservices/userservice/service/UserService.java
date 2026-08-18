package com.microservices.userservice.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.microservices.userservice.dto.UserDto;

@Service
public class UserService {

    private final List<UserDto> users = Arrays.asList(
            new UserDto(1L, "Guru", "guru@example.com"),
            new UserDto(2L, "prasad", "prasad@example.com"),
            new UserDto(3L, "Guruprasad", "Guruprasad@example.com")
    );

    public UserDto getUserById(Long id) {

        return users.stream()
                .filter(user -> user.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}