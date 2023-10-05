package com.example.demo.dto.response;


	import com.example.demo.model.enumerate.Role;

	import lombok.AllArgsConstructor;
	import lombok.Builder;
	import lombok.Data;
	import lombok.NoArgsConstructor;

	@Data
	@Builder
	@NoArgsConstructor
	@AllArgsConstructor
	public class UserNewResponse {
	    private Long uid;
	    private String name;
	    private String email;
	    private Boolean isEnabled;
	    private Role role;
	}


