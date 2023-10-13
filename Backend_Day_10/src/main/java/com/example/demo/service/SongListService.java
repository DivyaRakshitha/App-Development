package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.SongList;
import com.example.demo.repository.SongListRepository;

@Service
public class SongListService {

    @Autowired
    private SongListRepository songRepository;

    public List<SongList> getAllSongLists() {
        return songRepository.findAll();
    }

    public SongList createSongList(SongList task) {
        return songRepository.save(task);
    }
    
    public SongList updateSongList(Long taskId, SongList updatedSongList) {
        // Ensure the task with the given ID exists in the database
        Optional<SongList> existingSongListOptional = songRepository.findById(taskId);

        if (!existingSongListOptional.isPresent()) {
            return null;
        }

        // Get the existing task
        SongList existingSongList = existingSongListOptional.get();

        // Update the fields of the existing task with the new values
        existingSongList.setSong(updatedSongList.getSong());
        existingSongList.setReleasedate(updatedSongList.getReleasedate());
        existingSongList.setSinger(updatedSongList.getSong());

        // Save the updated task to the database
        return songRepository.save(existingSongList);
    }
    

    public void deleteSongList(Long taskId) {
        songRepository.deleteById(taskId);
    }
    
}
