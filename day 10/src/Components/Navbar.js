import React from 'react';
import { Link } from 'react-router-dom';
import "../styles/navbar.css";

const Navigation = () => {
  return (
    <nav className='landingNav'>
      <ul className='landingUl'>
      <Link to='/homenew' style={{textDecoration : 'none'}}>
          <li className='LandList1'>HOME</li>
        </Link>
        <Link to='/Genre' style={{textDecoration : 'none'}}>
          <li className='LandList'>GENRE</li>
        </Link>
        <Link to='/artists' style={{textDecoration : 'none'}}>
          <li className='LandList'>ARTISTS</li>
        </Link>
        <Link to='/albums' style={{textDecoration : 'none'}}>
          <li className='LandList'>ALBUMS</li>
        </Link>
     
      </ul>
    </nav>
  );
}

export default Navigation;