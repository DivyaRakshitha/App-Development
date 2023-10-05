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

import com.example.demo.Service.SongsService;
import com.example.demo.model.Song;
import com.fasterxml.jackson.core.JsonProcessingException;

	@RestController

	public class SongsController {
			SongsService Service;
			
			@PostMapping("/post1")
			public ResponseEntity<Song> create1(final @RequestBody Song users){
				Song createUser=Service.create(users);
				return ResponseEntity.ok(createUser);
			}
			
			@GetMapping("/get1")
			public ResponseEntity<Optional<Song>> read1(final @PathVariable Long id){
				Optional<Song> createdCandidate=Service.read(id);
				return ResponseEntity.ok(createdCandidate);
			}
			
			@PutMapping("/put1")
			public ResponseEntity<Song> update1(final @RequestBody Song user)throws  JsonProcessingException{
				final Song updatedUser=Service.update(user);
				return ResponseEntity.ok(updatedUser);
			}
			
			@DeleteMapping("/delete1")
			public void delete1(final @PathVariable Long id) {
				Service.delete(id);
			}
		}






