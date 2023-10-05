package com.example.demo.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
	@Entity
	@Table(name="song")
	public class Song {
		@Id
		@GeneratedValue(strategy = GenerationType.AUTO)
		private long song_id;
		private String song_title;
		private String song_duration;
		private String album_name;
		private String artist_name;
		public long getSong_id() {
			return song_id;
		}
		public void setSong_id(long song_id) {
			this.song_id = song_id;
		}
		public String getSong_title() {
			return song_title;
		}
		public void setSong_title(String song_title) {
			this.song_title = song_title;
		}
		public String getSong_duration() {
			return song_duration;
		}
		public void setSong_duration(String song_duration) {
			this.song_duration = song_duration;
		}
		public String getAlbum_name() {
			return album_name;
		}
		public void setAlbum_name(String album_name) {
			this.album_name = album_name;
		}
		public String getArtist_name() {
			return artist_name;
		}
		public void setArtist_name(String artist_name) {
			this.artist_name = artist_name;
		}
}
