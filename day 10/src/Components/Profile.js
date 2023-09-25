import React, { useState } from 'react';
import '../styles/profile.css'
import profile from '../Assets/profile.png'
function Profile() {
  const [username, setUsername] = useState(''); // Replace with user data from your app's state or API
  const [email, setEmail] = useState(''); 
 
  

  const handleUsernameChange = (e) => {
    setUsername(e.target.value);
  };

  const handleEmailChange = (e) => {
    setEmail(e.target.value);
  };

  // Handle profile image upload (you would typically use a library for this)
  const handleImageUpload = (e) => {
    const file = e.target.files[0];
    if (file) {
      // Handle image upload logic here
      // You may upload the image to a server and update the user's profileImage state
    }
  };

  return (
    <div>
      <h1>Your Profile</h1>
      <div className="profile-info">
        <div className="profile-image">
          <img src={profile} alt="Profile" />
          <input type="file" accept="image/*" onChange={handleImageUpload} />
        </div>
        <div className="profile-details">
          <label>Username:</label>
          <input type="text" value={username} onChange={handleUsernameChange} />
          <label>Email:</label>
          <input type="email" value={email} onChange={handleEmailChange} />
        </div>
      </div>
      <button>Save Changes</button>
    </div>
  );
}

export default Profile;
