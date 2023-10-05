package com.example.demo.service.impl;


	import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.boot.autoconfigure.security.SecurityProperties.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dto.info.PlaylistInfo;
import com.example.demo.dto.request.SongRequest;
import com.example.demo.model.Playlist;
import com.example.demo.model.Song;
import com.example.demo.model.SongMapping;
import com.example.demo.model.UserNew;
import com.example.demo.repository.PlaylistRepository;
import com.example.demo.repository.SongRepository;
import com.example.demo.repository.UserNewRepository;
import com.example.demo.service.PlaylistService;
import com.example.demo.service.SongService;

import lombok.RequiredArgsConstructor;

	@Service
	@Transactional
	@RequiredArgsConstructor
	public class SongServiceImpl implements SongService {

	    private final UserNewRepository userRepository;
	    private final PlaylistRepository playlistRepository;
	    private final SongRepository songRepository;
	    private final PlaylistService playlistService;

	    @Override
	    public boolean saveSong(SongRequest request) {
	        UserNew user = userRepository.findByUid(request.getUid());
	        List<PlaylistInfo> playlistInfoList = request.getPlaylists();
	        long songTotal = calculateOrderTotal(playlistInfoList);

	        if (songTotal <= 0) {
	            throw new IllegalArgumentException("Song total must be greater than zero");
	        }

	        try {
	            Song song = createSong(request, user, songTotal, playlistInfoList);
	            songRepository.save(song);
	            return true;
	        } catch (Exception e) {
	            e.printStackTrace();
	            return false;
	        }
	    }

	    private Song createSong(SongRequest request, UserNew user, long songTotal, List<PlaylistInfo> playlistInfoList) {
	        Song song = Song.builder()
	                .songAddedDate(new Date())
	                .songDuration(request.getSongDuration())
	                .songAlbumName(request.getSongName())
	                .songTotal(songTotal)
	                .user(user)
	                .songMappings(request.getPlaylists().stream()
	                        .map(playlistRequest -> {
	                            Playlist playlist = playlistService.getPlaylistModelId(playlistRequest.getPid());
	                            if (playlist != null) {
	                                return SongMapping.builder().playlist(playlist).build();
	                            } else {
	                                throw new IllegalArgumentException("Invalid playlist ID: " + playlistRequest.getPid());
	                            }
	                        })
	                        .collect(Collectors.toList()))
	                .build();

	        updatePlaylistQuantities(playlistInfoList);

	        return song;
	    }

	    private List<Playlist> updatePlaylistQuantities(List<PlaylistInfo> playlistInfoList) {
	        List<Playlist> updatedPlaylists = new ArrayList<>();

	        for (PlaylistInfo playlistInfo : playlistInfoList) {
	            Long playlistId = playlistInfo.getPid();
	            Long quantity = playlistInfo.getGetQuantity();

	            Playlist playlist = getPlaylistOrThrow(playlistId);

	            if (playlist.getPlaylistQuantity() < quantity) {
	                throw new IllegalArgumentException("Insufficient quantity for playlist ID: " + playlistId);
	            }

	            Playlist updatedPlaylist = createUpdatedPlaylist(playlist, quantity);
	            playlistRepository.save(updatedPlaylist);
	            updatedPlaylist.add(updatedPlaylist);
	        }

	        return updatedPlaylists;
	    }

	    private Playlist getPlaylistOrThrow(Long playlistId) {
			// TODO Auto-generated method stub
			return null;
		}

		private Playlist getPlaylistOrThrow1(Long playlistId) {
	        return playlistRepository.findById(playlistId)
	                .orElseThrow(() -> new IllegalArgumentException("Playlist not found for ID: " + playlistId));
	    }

	    private Playlist createUpdatedPlaylist(Playlist playlist, Long quantity) {
	    	Playlist updatedPlaylist = new Playlist();
	        updatedPlaylist.setPid(playlist.getPid());
	        updatedPlaylist.setPlaylistName(playlist.getPlaylistName());
	        updatedPlaylist.setPlaylistDuration(playlist.getPlaylistDuration());
	        updatedPlaylist.setPlaylistQuantity(playlist.getPlaylistQuantity() - quantity);
	        updatedPlaylist.setPlaylistImage(playlist.getPlaylistImage());
	        updatedPlaylist.setPlaylistDesc(playlist.getPlaylistDesc());
	        return updatedPlaylist;
	    }

	    private long calculateOrderTotal(List<PlaylistInfo> playlistInfoList) {
	        return playlistInfoList.stream()
	                .mapToLong(PlaylistInfo -> {
	                	Playlist playlist = getPlaylistOrThrow(PlaylistInfo.getPid());
	                    if (playlist.getPlaylistQuantity() < PlaylistInfo.getGetQuantity()) {
	                        throw new IllegalArgumentException(
	                                "Insufficient song quantity for playlist ID: " + PlaylistInfo.getPid());
	                    }
	                    return (long) (playlist.getPlaylistDuration() * PlaylistInfo.getGetQuantity());
	                })
	                .sum();
	    }
	}


