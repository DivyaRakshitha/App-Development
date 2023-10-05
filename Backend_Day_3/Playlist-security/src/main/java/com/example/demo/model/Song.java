package com.example.demo.model;

import java.util.Date;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
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
@Table(name = "_song")
public class Song {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long sid;

    @Column(nullable = false)
    private Date songAddedDate;

    @Column(nullable = false)
    private Long songTotal;

    @Column(length = 300, nullable = false)
    private String songDuration;

    @Column(length = 50, nullable = false)
    private String songAlbumName;

    @ManyToOne(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    private UserNew user;

    @OneToMany(cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    @JoinColumn(name = "song_sid")
    private List<SongMapping> songMappings;
}
