package com.example.demo.service.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;

import com.example.demo.model.UserNew;
import com.example.demo.model.enumerate.Role;
import com.example.demo.dto.request.UserNewRequest;
import com.example.demo.dto.response.UserNewResponse;
import com.example.demo.repository.SongRepository;
import com.example.demo.repository.UserNewRepository;
import com.example.demo.service.UserNewService;
import com.example.demo.model.UserNew;

import jakarta.transaction.Transactional;
import lombok.RequiredArgsConstructor;

@Service
@Transactional
@RequiredArgsConstructor
public class UserServiceImpl implements UserNewService {

    private final UserNewRepository userRepository;
    private final SongRepository songRepository;

    @Override
    public List<UserNewResponse> getAllUsers() {
        List<UserNew> userList = userRepository.findAll();
        return userList.stream()
                .filter(user -> !user.getRole().equals(Role.ADMIN))
                .map(this::mapUserToUserResponse)
                .collect(Collectors.toList());
    }

    @Override
    public UserNewResponse getUser(Long uid) {
        UserNew user = userRepository.findByUid(uid);
        return mapUserToUserResponse(user);
    }

    
    @Override
    public UserNewResponse updateUser(UserNewRequest request, Long uid) {
        UserNew user = userRepository.findByUid(uid);
        UserNew newUser = new UserNew();
        if (user != null) {
            // Update the fields of the existing user object
        	newUser = UserNew.builder()
        			.name(user.getName())
                    .email(user.getEmail())
                    .password(user.getPassword())
                    .role(user.getRole())
                    .isEnabled(user.getIsEnabled())
                    .build();

            // Save the updated user object
            userRepository.save(user);
            
            // Return the updated user response
            return mapUserToUserResponse(user);
        } else {
            // Handle the case when the user with the given uid is not found
            return null;
        }
    }


    @Override
    public boolean deletePlaylist(Long uid) {
        UserNew user = userRepository.findByUid(uid);

        if (user != null) {
            songRepository.deleteByUserUid(uid);
            userRepository.deleteByUid(uid);
            return true;
        } else {
            return false;
        }
    }

    private UserNewResponse mapUserToUserResponse(UserNew user) {
        return UserNewResponse.builder()
                .uid(user.getUid())
                .name(user.getName())
                .email(user.getEmail())
                .role(user.getRole())
                .isEnabled(user.getIsEnabled())
                .build();
    }
}
