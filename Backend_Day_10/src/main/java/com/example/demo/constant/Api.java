package com.example.demo.constant;


	import java.util.Arrays;
	import java.util.List;

	public class Api {
	    public static final String AUTH = "/api/auth";
	    public static final String USER = "/api/user";
	    public static final String PLAYLIST = "/api/playlist";
	    public static final String SONG = "/api/song";
	    public static final List<String> HEADERS = Arrays.asList("Authorization", "Content-Type");
	    public static final List<String> METHODS = Arrays.asList("GET", "POST", "PUT", "DELETE");
	    public static final List<String> ORIGINS = Arrays.asList("http://localhost:3000");
	}

