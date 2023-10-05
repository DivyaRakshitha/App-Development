package com.example.demo.controller;



	import java.util.List;

	import org.springframework.http.ResponseEntity;
	import org.springframework.web.bind.annotation.DeleteMapping;
	import org.springframework.web.bind.annotation.GetMapping;
	import org.springframework.web.bind.annotation.PathVariable;
	import org.springframework.web.bind.annotation.PutMapping;
	import org.springframework.web.bind.annotation.RequestBody;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.bind.annotation.RestController;

	import com.example.demo.constant.Api;
	import com.example.demo.dto.request.UserNewRequest;
	import com.example.demo.dto.response.UserNewResponse;
	import com.example.demo.service.UserNewService;

	import io.swagger.v3.oas.annotations.tags.Tag;
	import lombok.RequiredArgsConstructor;

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

	    @GetMapping("/{uid}")
	    public ResponseEntity<UserNewResponse> getUser(@PathVariable Long uid) {
	        UserNewResponse userResponse = userService.getUser(uid);
	        return userResponse != null ? ResponseEntity.ok().body(userResponse) : ResponseEntity.notFound().build();
	    }

	    @PutMapping("/update/{uid}")
	    public ResponseEntity<UserNewResponse> updateUser(@RequestBody UserNewRequest request, @PathVariable Long uid) {
	        UserNewResponse userResponse = userService.updateUser(request, uid);
	        return userResponse != null ? ResponseEntity.ok().body(userResponse) : ResponseEntity.notFound().build();
	    }

	    @DeleteMapping("/delete/{uid}")
	    public ResponseEntity<String> deleteUser(@PathVariable Long uid) {
	        boolean isDeleted = userService.deletePlaylist(uid);
	        return isDeleted ? ResponseEntity.ok().body("User deleted successfully!")
	                : ResponseEntity.notFound().build();
	    }
	}


