import React from 'react'
import '../styles/Genre.css'
import { Link } from 'react-router-dom';
import Navbar from './Navbar';
import Love from '../Assets/Love.jpeg'
import Pop from '../Assets/Pop.jpeg'
import Devotional from '../Assets/Devotional.jpg'
import Mood from '../Assets/Mood.jpeg'
import Footer from '../Components/Footer.js'
class Genre extends React.Component{
 
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
      From love pop's catchy beats to devotional serenity, explore a world of emotions with our curated genres
      </p>
      <div className='topsmall'>
        <h3 className='zzz'>Pick your genre</h3>
      </div>
      </div>
    </div>
    <div className='container'>
      <div className='box1'>
       <img className="proimage"src={Love} alt="img1"/> 
      <h3>Genre 1</h3>
      <p class="subtext">100 songs</p>
      </div>
      <div className='box2'>
       <img className="proimage"src={Pop} alt="img2"/> 
      <h3>Genre 2</h3>
      <p class="subtext">100 songs</p>
      </div>
      <div className='box3'>
       <img className="proimage"src={Devotional} alt="img3"/> 
      <h3>Genre 3</h3>
      <p class="subtext">100 songs</p>
      </div>
      <div className='box3'>
      <img className="proimage"src={Mood} alt="img4"/> 
      <h3>Genre 4</h3>
      <p class="subtext">100 songs</p>
      </div>
    </div>
    
    </div>
    <Footer />
    </>
    )
  }
}
export default Genre;