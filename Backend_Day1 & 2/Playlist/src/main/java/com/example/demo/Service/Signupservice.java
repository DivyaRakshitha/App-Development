package com.example.demo.Service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.signupRepo;
import com.example.demo.model.Signup;

@Service
public class Signupservice {



    @Autowired
  	signupRepo userRepository;
  	public Signup create(Signup users) {
  		return userRepository.save(users);
  	}
  	public Optional<Signup> read(Long id){
  		return userRepository.findById(id);
  	}
  	public Signup update(Signup users) {
  		return userRepository.save(users);
  		
  	}
  	public void delete(Long Id) {
  		userRepository.deleteById(Id);
  	}
  	
}

