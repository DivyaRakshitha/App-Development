import React from 'react';
import { Link } from 'react-router-dom';
import "../styles/navbar.css";

const Navigation = () => {
  return (
    <nav className='landingNav'>
      <ul className='landingUl'>
      <Link to='/home' style={{textDecoration : 'none'}}>
          <li className='LandList1'>HOME</li>
        </Link>
        <Link to='/aboutus' style={{textDecoration : 'none'}}>
          <li className='LandList'>GENRE</li>
        </Link>
        <Link to='/contact' style={{textDecoration : 'none'}}>
          <li className='LandList'>ARTISTS</li>
        </Link>
        <Link to='/' style={{textDecoration : 'none'}}>
          <li className='LandList'>ALBUMS</li>
        </Link>
     
      </ul>
    </nav>
  );
}

export default Navigation;