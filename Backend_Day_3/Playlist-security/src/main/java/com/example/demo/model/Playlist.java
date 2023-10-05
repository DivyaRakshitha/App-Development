package com.example.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "_playlist")
public class Playlist {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long pid;

    @Column(length = 250, nullable = false)
    private String playlistName;

    @Column(nullable = false)
    private float playlistDuration;

    @Column(nullable = false)
    private Long playlistQuantity;

    @Column(nullable = false)
    private String playlistImage;

    @Column(length = 50000, nullable = true)
    private String playlistDesc;

	public void add(Playlist updatedPlaylist) {
		// TODO Auto-generated method stub
		
	}
}
