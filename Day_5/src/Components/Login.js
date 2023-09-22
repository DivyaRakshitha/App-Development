import React, { useState } from 'react';
import { ToastContainer, toast } from 'react-toastify';
import { Link, useNavigate } from 'react-router-dom';
import 'react-toastify/dist/ReactToastify.css';
import '../styles/login.css';

import { useDispatch } from 'react-redux';
import { loginUser } from './authAction';
import Navbar from './Navbar';

function Login() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');
  const dispatch = useDispatch();
  const navigate = useNavigate();

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleSubmit = async (e) => {
    e.preventDefault();

    if (!email || !password) {
      toast.error('Please fill in all fields.');
      return;
    }

    // Construct the login data object
    const formData = {
      email,
      password,
    };

    try {
      // Dispatch the login action
      await dispatch(loginUser(formData));

      // If login is successful, navigate to the dashboard
      navigate('/dashboard');
    } catch (error) {
      // Handle login errors here and show an error toast
      toast.error('Login failed. Please check your credentials.');
    }
  };

  return (
    <>
    <Navbar/>
    <div className='divi'>
      <ToastContainer />
      <div className="login-container">
        <h2>Login</h2>
        <form onSubmit={handleSubmit}>
          <div className="form-group">
            <label>Email:</label>
            <input type="email" value={email} onChange={handleEmailChange} />
          </div>
          <div className="form-group">
            <label>Password:</label>
            <input type="password" value={password} onChange={handlePasswordChange} />
          </div>
          <button className='button' type="submit">Login</button>
        </form>
      </div>
    </div>
    </>
  );
}

export default Login;
