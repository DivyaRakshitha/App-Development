
import { createStore, applyMiddleware, combineReducers } from 'redux';
import thunk from 'redux-thunk';
import authReducer from './authReducer';
import songListReducer from './songListSlice';

const rootReducer = combineReducers({
  auth: authReducer,
  songList: songListReducer,
});

const store = createStore(rootReducer, applyMiddleware(thunk));

export default store;