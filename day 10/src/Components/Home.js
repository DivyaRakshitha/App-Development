import React from 'react';
import { Link } from 'react-router-dom';
import '../styles/home.css';

function Home() {
  return (
    <div className='loginc'>
    <Link to="/login" className="login-button">
      Log In
    </Link>
    <Link to="/signup" className="signup-button">
      Sign Up
    </Link>
    </div>
  );
}

export default Home;
