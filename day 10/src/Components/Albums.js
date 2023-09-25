
import React from 'react'
import '../styles/albums.css'
import { Link } from 'react-router-dom';
import Navbar from './Navbar';
import Tamil from '../Assets/Tamil.jpeg'
import Telugu from '../Assets/Telugu.jpeg'
import Malayalam from '../Assets/Malayalam.jpeg'
import Kannada from '../Assets/Kannada.jpeg'
import Footer from '../Components/Footer.js'
import '../styles/albums.css'
class Albums extends React.Component{
 
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
      "Unveil musical narratives and emotions within every album, where each track is a unique world of rhythms and stories, ready to transport you to new horizons."
      </p>
      <div className='topsmall'>
        <h3 className='zzz'>Pick your album</h3>
      </div>
      </div>
    </div>
    <div className='container'>
      <div className='box1'>
       <img className="proimage"src={Tamil} alt="img1"/> 
      <h3>Album 1</h3>
      <p class="subtext">100 songs</p>
      </div>
      <div className='box2'>
       <img className="proimage"src={Telugu} alt="img2"/> 
      <h3>Album 2</h3>
    
      <p class="subtext">100 songs</p>
      </div>
      <div className='box3'>
       <img className="proimage"src={Malayalam} alt="img3"/> 
      <h3>Album 3</h3>
      <p class="subtext">100 songs</p>
      </div>
      <div className='box3'>
      <img className="proimage"src={Kannada} alt="img4"/> 
      <h3>Album 4</h3>
      <p class="subtext">100 songs</p>
      </div>
    </div>
    
    </div>
    <Footer />
    </>
    )
  }
}
export default Albums;