package com.example.demo.dto.request;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class PlaylistRequest {
    private String playlistName;
    private float playlistDuration;
    private Long playlistQuantity;
    private String playlistImage;
    private String playlistDesc;
}
