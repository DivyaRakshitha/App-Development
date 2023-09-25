import React from 'react';
import '../styles/homenew.css'; // Import your CSS file
import 'font-awesome/css/font-awesome.min.css'; // Import Font Awesome CSS
import Footer from '../Components/Footer.js'
function Homenew() {
  return (
    <>
  
    <div className="main">
      <div className="main-header">
        <div className="nav-button but-hol">
          <span className="nos"></span>
          <span className="ncs"></span>
          <span className="nbs"></span>
          <div className="menu-button-text">Menu</div>
        </div>
        <div className="header-social">
          <ul>
            <li>
              <a target="_blank" href="https://www.facebook.com/">
                <i className="fa fa-facebook"></i>
              </a>
            </li>
            <li>
              <a target="_blank" href="https://twitter.com/?lang=en">
                <i className="fa fa-twitter"></i>
              </a>
            </li>
            <li>
              <a target="_blank" href="https://www.instagram.com/">
                <i className="fa fa-instagram"></i>
              </a>
            </li>
          </ul>
        </div>
        <div className="folio-btn">
          <a
            className="folio-btn-item ajax"
            href=""
            target="_blank"
            rel="noopener noreferrer"
          >
            <span className="folio-btn-dot"></span>
            <span className="folio-btn-dot"></span>
            <span className="folio-btn-dot"></span>
            <span className="folio-btn-dot"></span>
            <span className="folio-btn-dot"></span>
            <span className="folio-btn-dot"></span>
            <span className="folio-btn-dot"></span>
            <span className="folio-btn-dot"></span>
            <span className="folio-btn-dot"></span>
          </a>
        </div>
      </div>

      <div id="wrapper">
        <div className="content-holder">
          <div className="hero-wrap fl-wrap full-height scroll-con-sec">
            <div className="impulse-wrap">
              <div className="mm-par-wrap">
                <div
                  className="mm-parallax"
                  data-tilt
                  data-tilt-max="4"
                >
                  <div className="overlay"></div>
                  <div
                    className="bg"
                    data-bg="https://images.unsplash.com/photo-1499018658500-b21c72d7172b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80"
                    style={{
                      backgroundImage: 'url(https://images.unsplash.com/photo-1499018658500-b21c72d7172b?ixlib=rb-1.2.1&ixid=eyJhcHBfaWQiOjEyMDd9&auto=format&fit=crop&w=1500&q=80)',
                    }}
                  ></div>
                  <div className="hero-wrap-item fl-wrap">
                    <div className="container">
                      <div className="fl-wrap section-entry hiddec-anim" style={{ opacity: 1 }}>
                        <h1 className="BoardName">Welcome to MUSIC-MINGLE</h1>
                      </div>
                    </div>
                  </div>
                </div>
              </div>
            </div>
            <div className="hero-corner hiddec-anim" style={{ opacity: 1, transform: 'translate3d(0px, 0px, 0px)' }}></div>
            <div className="hero-corner2 hiddec-anim" style={{ opacity: 1, transform: 'translate3d(0px, 0px, 0px)' }}></div>
            <div className="hero-corner3 hiddec-anim" style={{ opacity: 1, transform: 'translate3d(0px, 0px, 0px)' }}></div>
            <div className="hero-corner4 hiddec-anim" style={{ opacity: 1, transform: 'translate3d(0px, 0px, 0px)' }}></div>
          </div>
        </div>
      </div>
    </div>
  <Footer/>
</>
  );
}

export default Homenew;
