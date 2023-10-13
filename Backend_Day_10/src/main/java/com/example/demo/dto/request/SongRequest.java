package com.example.demo.dto.request;

import java.util.Collection;
import java.util.List;

import com.example.demo.dto.info.PlaylistInfo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class SongRequest {
    private String songName;
    private String songDuration;
    private Long uid;
    private List<PlaylistInfo> playlists;

}
