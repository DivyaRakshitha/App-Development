// songListSlice.js
import { createSlice } from '@reduxjs/toolkit';

const songListSlice = createSlice({
  name: 'songList',
  initialState: [],
  reducers: {
    addSong: (state, action) => {
      state.push(action.payload);
    },
    loadSongList: (state, action) => {
      return action.payload;
    },
  },
});

export const { addSong, loadSongList } = songListSlice.actions;
export default songListSlice.reducer;
