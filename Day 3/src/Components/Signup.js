import React, { useState } from 'react';
import { ToastContainer, toast } from 'react-toastify';
import 'react-toastify/dist/ReactToastify.css'; // Import the CSS for react-toastify
import '../styles/signup.css';

function SignUp() {
  const [name, setName] = useState('');
  const [email, setEmail] = useState('');
  const [password, setPassword] = useState('');

  const handleNameChange = (e) => {
    setName(e.target.value);
  };

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  const handlePasswordChange = (e) => {
    setPassword(e.target.value);
  };

  const handleSubmit = (e) => {
    e.preventDefault();

    if (!name || !email || !password) {
      toast.error('Please fill in all fields.');
      return;
    }

    // Simulate a successful sign-up (Replace this with your actual sign-up logic)
    setTimeout(() => {
      // Replace this with your actual success message
      toast.success('Sign-up successful!');
      
      // Redirect to the home page upon successful sign-up
      // Example: history.push('/home');
    }, 2000); // Simulating a 2-second delay before showing the success message (Remove this in your actual code)
  };

  return (
    <div>
      <ToastContainer />
      <div className="signup-container">
        <h2>Sign Up</h2>
        <form onSubmit={handleSubmit}>
          <div className="form-group">
            <label>Name:</label>
            <input type="text" value={name} onChange={handleNameChange} />
          </div>
          <div className="form-group">
            <label>Email:</label>
            <input type="email" value={email} onChange={handleEmailChange} />
          </div>
          <div className="form-group">
            <label>Password:</label>
            <input type="password" value={password} onChange={handlePasswordChange} />
          </div>
          <button className='button' type="submit">Sign Up</button>
        </form>
      </div>
    </div>
  );
}

export default SignUp;
