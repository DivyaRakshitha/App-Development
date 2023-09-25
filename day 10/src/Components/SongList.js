import React, { useState, useEffect } from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { addSong, loadSongList } from './songListSlice';

function SongList() {
  const songList = useSelector((state) => state.songList);
  const dispatch = useDispatch();
  const [newSong, setNewSong] = useState('');

  useEffect(() => {
    const storedSongList = localStorage.getItem('songList');
    if (storedSongList) {
      dispatch(loadSongList(JSON.parse(storedSongList))); // Initialize Redux state
    }
  }, [dispatch]);

  useEffect(() => {
    localStorage.setItem('songList', JSON.stringify(songList));
  }, [songList]);

  const handleAddSong = () => {
    if (newSong.trim() !== '') {
      dispatch(addSong(newSong));
      setNewSong('');
    }
  };

  return (
    <div>
      <h1>Add Songs to Your List</h1>
      <div>
        <input
          type="text"
          placeholder="Enter a song name"
          value={newSong}
          onChange={(e) => setNewSong(e.target.value)}
        />
        <button onClick={handleAddSong}>Add Song</button>
      </div>
      <ul>
        {songList.map((song, index) => (
          <li key={index}>{song}</li>
        ))}
      </ul>
    </div>
  );
}

export default SongList;
