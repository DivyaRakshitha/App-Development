package com.example.demo.dto.response;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlaylistResponse {
    private Long pid;
    private String playlistName;
    private float playlistDuration;
    private Long playlistQuantity;
    private String playlistImage;
    private String playlistDesc;
}
