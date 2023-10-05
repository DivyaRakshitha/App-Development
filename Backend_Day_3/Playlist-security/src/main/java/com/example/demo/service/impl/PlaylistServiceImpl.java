package com.example.demo.service.impl;

import java.util.List; 
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.example.demo.dto.request.PlaylistRequest;
import com.example.demo.dto.response.PlaylistResponse;
import com.example.demo.model.Playlist;
import com.example.demo.repository.PlaylistRepository;
import com.example.demo.service.PlaylistService;

import jakarta.persistence.EntityNotFoundException;
import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class PlaylistServiceImpl implements PlaylistService {

	
    private final PlaylistRepository playlistRepository;

    @Override
    public boolean savePlaylist(PlaylistRequest request) {
        if (playlistRepository.findByPlaylistName(request.getPlaylistName()).isPresent()) {
            return false;
        }

        Playlist playlist = Playlist.builder()
                .playlistName(request.getPlaylistName())
                .playlistDuration(request.getPlaylistDuration())
                .playlistQuantity(request.getPlaylistQuantity())
                .playlistDesc(request.getPlaylistDesc())
                .playlistImage(request.getPlaylistImage())
                .build();

        playlistRepository.save(playlist);
        return true;
    }

    @Override
    public List<PlaylistResponse> getAllPlaylists() {
        List<Playlist> playlistList = playlistRepository.findAll();

        return playlistList.stream()
                .map(this::mapProductToResponse)
                .collect(Collectors.toList());
    }

    @Override
    public PlaylistResponse getPlaylist(Long pid) {
    	Playlist playlist = playlistRepository.findByPid(pid);
        return mapProductToResponse(playlist);
    }

    @Override
    public PlaylistResponse updatePlaylist(PlaylistRequest request, Long pid) {
    	Playlist playlist = playlistRepository.findByPid(pid);

        if (playlist != null) {
        	playlist.setPlaylistName(request.getPlaylistName());
        	playlist.setPlaylistDuration(request.getPlaylistDuration());
        	playlist.setPlaylistQuantity(request.getPlaylistQuantity());
        	playlist.setPlaylistDesc(request.getPlaylistDesc());
        	playlist.setPlaylistImage(request.getPlaylistImage());

        	playlistRepository.save(playlist);

            return mapProductToResponse(playlist);
        } else {
            throw new EntityNotFoundException("Playlist with pid " + pid + " not found");
        }
    }

    @Override
    public boolean deletePlaylist(Long pid) {
    	Playlist playlist = playlistRepository.findByPid(pid);

        if (playlist != null) {
        	playlistRepository.deleteByPid(pid);
            return true;
        } else {
            return false;
        }
    }

    private PlaylistResponse mapProductToResponse(Playlist playlist) {
        return PlaylistResponse.builder()
                .pid(playlist.getPid())
                .playlistName(playlist.getPlaylistName())
                .playlistDuration(playlist.getPlaylistDuration())
                .playlistQuantity(playlist.getPlaylistQuantity())
                .playlistDesc(playlist.getPlaylistDesc())
                .playlistImage(playlist.getPlaylistImage())
                .build();
    }

    @Override
    public Playlist getPlaylistModelId(Long pid) 
    {
        return playlistRepository.findByPid(pid);
    }

	@Override
	public boolean saveProduct(PlaylistRequest request) {
		// TODO Auto-generated method stub
		return false;
	}
}
