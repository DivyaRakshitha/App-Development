package com.example.demo.controller;

import java.util.Optional;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.Signupservice;
import com.example.demo.model.Signup;
import com.fasterxml.jackson.core.JsonProcessingException;

@RestController

public class Signupcontroller {
		Signupservice userService;
		
		@PostMapping("/post")
		public ResponseEntity<Signup> create1(final @RequestBody Signup users){
			Signup createUser=userService.create(users);
			return ResponseEntity.ok(createUser);
		}
		
		@GetMapping("/get")
		public ResponseEntity<Optional<Signup>> read1(final @PathVariable Long id){
			Optional<Signup> createdCandidate=userService.read(id);
			return ResponseEntity.ok(createdCandidate);
		}
		
		@PutMapping("/put")
		public ResponseEntity<Signup> update1(final @RequestBody Signup user)throws  JsonProcessingException{
			final Signup updatedUser=userService.update(user);
			return ResponseEntity.ok(updatedUser);
		}
		
		@DeleteMapping("/delete")
		public void delete1(final @PathVariable Long id) {
			userService.delete(id);
		}
	}

