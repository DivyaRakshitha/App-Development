package com.example.demo.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.Api;
import com.example.demo.dto.response.UserNewResponse;
import com.example.demo.model.UserNew;
import com.example.demo.service.UserNewService;
import com.fasterxml.jackson.core.JsonProcessingException;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

	@CrossOrigin
	@RestController
	@RequestMapping(Api.USER)
	@RequiredArgsConstructor
	@Tag(name = "User")
	public class UserNewController {

	    private final UserNewService userService;

	    @GetMapping("/all")
	    public ResponseEntity<List<UserNewResponse>> getAllUsers() {
	        List<UserNewResponse> userList = userService.getAllUsers();
	        return !userList.isEmpty() ? ResponseEntity.ok().body(userList) : ResponseEntity.noContent().build();
	    }

	    @GetMapping("/get/{uid}")
		public ResponseEntity<Optional<UserNew>> read(final @PathVariable Long uid){
			Optional<UserNew> createdCandidate=userService.read(uid);
			return ResponseEntity.ok(createdCandidate);
		}

	    @PutMapping("/put/{uid}")
		public ResponseEntity<UserNew> update(@PathVariable Long uid, @RequestBody UserNew user) throws JsonProcessingException {
		    Optional<UserNew> existingUserOptional = userService.read(uid);

		    if (existingUserOptional.isPresent()) {
		        UserNew existingUser = existingUserOptional.get();

		        
		        existingUser.setName(user.getName());
		        existingUser.setEmail(user.getEmail());
		        existingUser.setRole(user.getRole());
		        
		        if (user.getPassword() != null && !user.getPassword().isEmpty()) {
		            existingUser.setPassword(user.getPassword());
		        }
		        
		        final UserNew updatedUser = userService.update(existingUser);
		        return ResponseEntity.ok(updatedUser);
		    } else {
		        
		        return ResponseEntity.notFound().build();
		    }
		}

		@DeleteMapping("/delete/{id}")
		public void delete(final @PathVariable Long id) {
			userService.delete(id);
		}
	}


