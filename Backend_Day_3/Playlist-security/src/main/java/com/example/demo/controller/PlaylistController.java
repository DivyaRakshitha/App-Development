package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.Api;
import com.example.demo.dto.request.PlaylistRequest;
import com.example.demo.dto.response.PlaylistResponse;
import com.example.demo.service.PlaylistService;
import com.example.demo.service.impl.PlaylistServiceImpl;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequiredArgsConstructor
@Tag(name = "Playlist")
@RequestMapping(Api.PLAYLIST)
public class PlaylistController {

	@Autowired
    private final PlaylistService playlistService;

    @PostMapping("/save")
    public ResponseEntity<String> savePlaylist(@RequestBody  PlaylistRequest request) {
        boolean isSaved =  playlistService.savePlaylist(request);
        return isSaved ? ResponseEntity.status(201).body("Playlist added successfully!")
                : ResponseEntity.badRequest().build();
    }

    @GetMapping("/all")
    public ResponseEntity<List< PlaylistResponse>> getAllPlaylists() {
        List< PlaylistResponse>  playlistList =  playlistService.getAllPlaylists();
        return ! playlistList.isEmpty() ? ResponseEntity.status(200).body(playlistList)
                : ResponseEntity.noContent().build();
    }

    @GetMapping("/{pid}")
    public ResponseEntity<PlaylistResponse> getPlaylist(@PathVariable Long pid) {
    	PlaylistResponse playlistResponse = playlistService.getPlaylist(pid);
        return playlistResponse != null ? ResponseEntity.ok().body(playlistResponse) : ResponseEntity.notFound().build();
    }

    @PutMapping("/update/{pid}")
    public ResponseEntity<PlaylistResponse> updatePlaylist(@RequestBody PlaylistRequest request, @PathVariable Long pid) {
    	PlaylistResponse playlistResponse = playlistService.updatePlaylist(request, pid);
        return playlistResponse != null ? ResponseEntity.ok().body(playlistResponse) : ResponseEntity.notFound().build();
    }

    @DeleteMapping("/delete/{pid}")
    public ResponseEntity<String> deleteProduct(@PathVariable Long pid) {
        boolean isDeleted = playlistService.deletePlaylist(pid);
        return isDeleted ? ResponseEntity.ok().body("Playlist deleted successfully!")
                : ResponseEntity.notFound().build();
    }

}
