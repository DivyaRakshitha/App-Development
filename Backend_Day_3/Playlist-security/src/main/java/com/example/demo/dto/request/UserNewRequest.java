package com.example.demo.dto.request;


	import java.util.List;

	import com.example.demo.model.enumerate.Role;

	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;


	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public class UserNewRequest {
	    private String name;
	    private String email;
	    private String password;
	    private Boolean isEnabled;
	    private Role role;
	}


