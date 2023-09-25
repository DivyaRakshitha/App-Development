import React from 'react';
import { BrowserRouter as Router, Route, Routes } from 'react-router-dom';
import Dashboard from './Components/Dashboard';
import Home from './Components/Home';
import Signup from './Components/Signup';
//import Loginnew from './Components/Loginnew';
import Login from './Components/Login';
import Genre from './Components/Genre';
import Artists from './Components/Artists';
import SongList from './Components/SongList';
import Profile from './Components/Profile';
import Homenew from './Components/Homenew';
import Footer from './Components/Footer';
import Privacy from './Components/Privacy Policy';
import FAQSection from './Components/FAQ';
import Terms from './Components/Terms';
import Albums from './Components/Albums';
function App() {
  return (
    <Router>
      <Routes>
        <Route path="/Genre" element={<Genre/>} />
        <Route path="/" element={<Home/>} />
        <Route path="/homenew" element={<Homenew/>} />
        <Route path="/login" element={<Login />} />
        <Route path="/signup" element={<Signup/>} />
        <Route path="/songlist" element={<SongList/>} />
        <Route path="/dashboard" element={<Dashboard />} />
        <Route path="/profile" element={<Profile />} />
        <Route path="/artists" element={<Artists />} />
        <Route path="/albums" element={<Albums />} />
        <Route path="/privacy-policy" element={<Privacy />} />
        <Route path="/terms-and-conditions" element={<Terms />} />
        <Route path="/faq" element={<FAQSection />} />
        <Route path="/footer" element={<Footer />} />
      </Routes>
    </Router>
  );  
}

export default App;
