package com.example.demo.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constant.Api;
import com.example.demo.dto.request.SongRequest;
import com.example.demo.service.SongService;

import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping(Api.SONG)
@RequiredArgsConstructor
@Tag(name = "Song")
public class SongController {

    private final SongService songService;

    @PostMapping("/save")
    public ResponseEntity<String> saveOrder(@RequestBody SongRequest request) {
        boolean isSaved = songService.saveSong(request);
        return isSaved ? ResponseEntity.status(200).body("Song added successfully!")
                : ResponseEntity.badRequest().build();
    }
}
