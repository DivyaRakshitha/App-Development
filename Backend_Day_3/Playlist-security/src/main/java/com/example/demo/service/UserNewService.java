package com.example.demo.service;





	import java.util.List;

import com.example.demo.dto.request.UserNewRequest;
import com.example.demo.dto.response.UserNewResponse;

	public interface UserNewService {

	    List<UserNewResponse> getAllUsers();

	    UserNewResponse getUser(Long uid);

	    UserNewResponse updateUser(UserNewRequest request, Long uid);

	    boolean deletePlaylist(Long uid);

	}



