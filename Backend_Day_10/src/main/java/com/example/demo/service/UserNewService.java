package com.example.demo.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.response.UserNewResponse;
import com.example.demo.model.UserNew;
import com.example.demo.model.enumerate.Role;
import com.example.demo.repository.UserNewRepository;

@Service
public class UserNewService {
    
    @Autowired
    UserNewRepository userRepository;

    public UserNew create(UserNew user) {
        return userRepository.save(user);
    }

    public Optional<UserNew> read(Long id) {
        return userRepository.findById(id);
    }

    public UserNew update(UserNew user) {
        return userRepository.save(user);
    }

    public void delete(Long id) {
        userRepository.deleteById(id);
    }

    public List<UserNewResponse> getAllUsers() {
        List<UserNew> userList = userRepository.findAll();
        return userList.stream()
                .filter(user -> !user.getRole().equals(Role.ADMIN))
                .map(this::mapUserNewToUserResponse)
                .collect(Collectors.toList());
    }

    private UserNewResponse mapUserNewToUserResponse(UserNew user) {
        return UserNewResponse.builder()
                .uid(user.getUid())
                .name(user.getName())
                .email(user.getEmail())
                .role(user.getRole())
                .build();
    }
}
