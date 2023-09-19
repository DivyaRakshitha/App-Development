import React, { useState } from 'react';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css'; // Import the CSS for react-toastify
import '../styles/login.css'; // Import your CSS for styling

function Login() {
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!email || !password) {
      toast.error('Please fill in all fields.');
      return;
    }

    // Simulate a successful login (Replace this with your actual authentication logic)
    setTimeout(() => {
      // Replace this with your actual success message
      toast.success('Login successful! Redirecting...');
      
      // Redirect to the home page upon successful login
      // Example: history.push('/home');
    }, 2000); // Simulating a 2-second delay before showing the success message (Remove this in your actual code)
  };

  return (
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
  );
}

export default Login;

