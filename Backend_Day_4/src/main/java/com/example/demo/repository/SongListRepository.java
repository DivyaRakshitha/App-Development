package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SongList;

public interface SongListRepository extends JpaRepository<SongList, Long> {

}
