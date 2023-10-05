package com.example.demo.Repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Signup;
	@Repository
	public interface signupRepo extends JpaRepository<Signup,Long> {
		
	      
	
}
