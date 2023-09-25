import React from 'react';
import { useSelector, useDispatch } from 'react-redux';
import { Link, useNavigate } from 'react-router-dom';
import { logoutUser } from './authAction';
import Navbar from './Navbar';
import { Card, CardContent, Typography, Button } from '@mui/material'; // Import Material-UI components
import { styled } from '@mui/system';
import Footer from '../Components/Footer.js'
import '../styles/dashboard.css';
function Dashboard() {
  const navigate = useNavigate();
  const user = useSelector((state) => state.auth.user);
  const dispatch = useDispatch();

  const handleLogout = () => {
    dispatch(logoutUser());
    navigate('/');
  };

  return (
    <>
      <Navbar />
      <div className="dashboard-container">
        <div className="sidebar">
          <div className="logo">MUSIC-MINGLE</div>
          <ul>
            <li>
              <Link to="/profile">Profile</Link>
            </li>
            <li>
              <Link to="/homenew">Home</Link>
            </li>
            
            <li>
              <Link to="/albums">Your Albums</Link>
            </li>
            
          </ul>
        </div>
        <div className="content">
          <header>
            <div className="top-nav">
              {user ? (
                <>
                  <div className="welcome">Welcome, {user.email}</div>
                  <button onClick={handleLogout}>Logout</button>
                </>
              ) : (
                <div className="welcome">Welcome</div>
              )}
            </div>
          </header>
          <main>
            <h1>Unlock the Power of Music Curation!</h1>
            <p>This is where you can manage your Songs and Playlists.</p>

            {/* Example Cards */}
            <div className="card-container">
              <Card className="dashcard">
                <CardContent>
                  <Typography variant="h5" component="div">
                    Playlist 1
                  </Typography>
                  <Typography variant="body2" color="text.secondary">
                    Tune into the Groove
                  </Typography>
                </CardContent>
              </Card>

              <Card className="dashcard">
                <CardContent>
                  <Typography variant="h5" component="div">
                    Playlist 2
                  </Typography>
                  <Typography variant="body2" color="text.secondary">
                    Songs for Every Mood
                  </Typography>
                </CardContent>
              </Card>

              <Card className="dashcard">
                <CardContent>
                  <Typography variant="h5" component="div">
                    Playlist 3
                  </Typography>
                  <Typography variant="body2" color="text.secondary">
                    Discover New Tunes Here
                  </Typography>
                </CardContent>
              </Card>
            </div>
          </main>
        </div>
      </div>
      <Footer />
    </>
  );
}


export default Dashboard;
