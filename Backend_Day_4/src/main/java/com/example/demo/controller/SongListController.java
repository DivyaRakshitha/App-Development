package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.Api;
import com.example.demo.model.SongList;
import com.example.demo.service.SongListService;

import lombok.RequiredArgsConstructor;


@CrossOrigin
@RestController
@RequestMapping(Api.SONG)
@RequiredArgsConstructor

public class SongListController {

    @Autowired
    private SongListService songService;

    @GetMapping("/getall")
    public List<SongList> getAllTasks() {
        return songService.getAllSongLists();
    }

    @PostMapping("/create")
    public SongList createTask(@RequestBody SongList song) {
        return songService.createSongList(song);
    }

    @PutMapping("/put/{songId}")
    public SongList updateTask(@PathVariable Long songId, @RequestBody SongList updatedsong) {
        SongList result = songService.updateSongList(songId, updatedsong);
        
        if (result == null) {   
        }
        return result;
    }
    
    @DeleteMapping("/delete/{songId}")
    public void deleteTask(@PathVariable Long songId) {
        songService.deleteSongList(songId);
    }

}
