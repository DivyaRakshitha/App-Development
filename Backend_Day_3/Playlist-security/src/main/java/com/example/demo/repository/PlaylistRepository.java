package com.example.demo.repository;



import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.model.Playlist;



@Repository
public interface PlaylistRepository extends JpaRepository<Playlist, Long> {

    Optional<Playlist> findByPlaylistName(String playlistName);

    Playlist findByPid(Long pid);

    void deleteByPid(Long pid);


}


