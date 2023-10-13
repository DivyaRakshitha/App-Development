package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.model.SongMapping;


public interface SongMappingRepository extends JpaRepository<SongMapping, Long> {

}
