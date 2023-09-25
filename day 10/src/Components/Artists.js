import React from 'react'
import '../styles/artist.css'
import { Link } from 'react-router-dom';
import Navbar from './Navbar';
import Artist1 from '../Assets/Artist1.jpeg'
import Artist2 from '../Assets/Artist2.jpeg'
import Artist3 from '../Assets/Artist3.jpeg'
import Artist4 from '../Assets/Artist4.jpeg'
import Footer from '../Components/Footer.js'
class Artists extends React.Component{
 
  render(){
    return(
    <>
    <Navbar />
    <div class="menpage">
    <div className='space'></div>
    <div className='topz'>
      {/* <img src={top} alt="workout img1" className='topimg'/> */}
      <div className='topright'>
      <p className='toptext'>
      "Music's rich tapestry is woven by a myriad of artists, each with a unique tale to tell.Explore their diverse sounds and stories in our musical universe."
      </p>
      <div className='topsmall'>
        <h3 className='zzz'>Pick your artist</h3>
      </div>
      </div>
    </div>
    <div className='container'>
      <div className='box1'>
       <img className="proimage"src={Artist1} alt="img1"/> 
      <h3>Artist 1</h3>
      <p class="subtext">100 songs</p>
      </div>
      <div className='box2'>
       <img className="proimage"src={Artist3} alt="img2"/> 
      <h3>Artist 2</h3>
    
      <p class="subtext">100 songs</p>
      </div>
      <div className='box3'>
       <img className="proimage"src={Artist2} alt="img3"/> 
      <h3>Artist 3</h3>
      <p class="subtext">100 songs</p>
      </div>
      <div className='box3'>
      <img className="proimage"src={Artist4} alt="img4"/> 
      <h3>Artist 4</h3>
      <p class="subtext">100 songs</p>
      </div>
    </div>
    
    </div>
    <Footer />
    
    </>
    )
  }
}
export default Artists;