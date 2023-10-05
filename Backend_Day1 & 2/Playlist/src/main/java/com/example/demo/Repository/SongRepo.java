package com.example.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import com.example.demo.model.Song;

	@Repository
	public interface SongRepo extends JpaRepository<Song,Long> {
		
	      
	

}
