package com.example.demo.service;


import java.util.List;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.PlaylistRequest;
import com.example.demo.dto.response.PlaylistResponse;
import com.example.demo.model.Playlist;


public interface PlaylistService {
	
    boolean saveProduct(PlaylistRequest request);

    List<PlaylistResponse> getAllPlaylists();

    PlaylistResponse getPlaylist(Long pid);

    PlaylistResponse updatePlaylist(PlaylistRequest request, Long pid);

    boolean deletePlaylist(Long pid);

    Playlist getPlaylistModelId(Long pid);

	boolean savePlaylist(PlaylistRequest request);

}