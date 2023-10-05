package com.example.demo.Service;



	import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.Repository.SongRepo;

import com.example.demo.model.Song;

	@Service
	public class SongsService {



	    @Autowired
	  	SongRepo songRepository;
	  	public Song create(Song users) {
	  		return songRepository.save(users);
	  	}
	  	public Optional<Song> read(Long id){
	  		return songRepository.findById(id);
	  	}
	  	public Song update(Song users) {
	  		return songRepository.save(users);
	  		
	  	}
	  	public void delete(Long Id) {
	  		songRepository.deleteById(Id);
	  	}
	  	
	}



