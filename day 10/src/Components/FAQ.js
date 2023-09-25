import React, { useState } from 'react';
import '../styles/faq.css';
import Navigation from '../Components/Navbar.js';
import Footer from '../Components/Footer.js';
function FAQSection() {
  // State to manage the visibility of each FAQ item
  const [faqItems, setFaqItems] = useState([
    { id: 1, question: 'What is Music-Mingle?', answer: ' Music-Mingle is a music streaming platform designed to provide you with a seamless music listening experience. It offers a vast library of songs and features to enhance your music discovery and enjoyment.', isOpen: false },
    { id: 2, question: 'Is Music-Mingle Free to Use?', answer: 'Yes,  Music-Mingle is free to download and use with basic features. However, for an ad-free experience and additional premium features, you can subscribe to our premium plan for a monthly fee, which will be clearly communicated to you.', isOpen: false },
    { id: 3, question: 'How Can I Discover New Music?', answer: 'To discover new music, simply use our search and recommendation features. You can explore genres, artists, playlists, and personalized recommendations to find the perfect tunes for any occasion.', isOpen: false },
    { id: 4, question: 'Can I Create and Share Playlists?', answer: 'Absolutely! With , you can create custom playlists and share them with your friends and followers. It\'s a great way to curate your favorite songs and share your musical tastes.', isOpen: false },
    { id: 5, question: 'What Devices and Platforms are Supported?', answer: '[Your Music App Name] is compatible with iOS and Android devices, and you can also access it through web browsers on your computer. Enjoy your music on smartphones, tablets, and desktops.', isOpen: false }
]);

    // Add more FAQ items here
  

  // Function to toggle the visibility of an FAQ item's answer
  const toggleAnswer = (id) => {
    setFaqItems((prevItems) =>
      prevItems.map((item) =>
        item.id === id ? { ...item, isOpen: !item.isOpen } : item
      )
    );
  };

  return (
    <>
    <Navigation/>
    <section className="faq-section">
      <div className="containerer">
        <div className="rower">
          <div className="col-md-6 offset-md-3">
            <div className="faq-title text-center pb-3">
              <h2>Faq</h2>
            </div>
          </div>
          <div className="col-md-6 offset-md-3">
            <div className="faq" id="accordion">
              {faqItems.map((item) => (
                <div className="carder1" key={item.id}>
                  <div className="carder1-header" id={`faqHeading-${item.id}`}>
                    <div className="mb-0">
                      <h5
                        className="faq-title"
                        onClick={() => toggleAnswer(item.id)}
                        aria-expanded={item.isOpen}
                        aria-controls={`faqCollapse-${item.id}`}
                      >
                        <span className="badge">{item.id}</span> {item.question}
                      </h5>
                    </div>
                  </div>
                  <div
                    id={`faqCollapse-${item.id}`}
                    className={`collapse ${item.isOpen ? 'show' : ''}`}
                    aria-labelledby={`faqHeading-${item.id}`}
                    data-parent="#accordion"
                  >
                    <div className="card-body">{item.answer}</div>
                  </div>
                </div>
              ))}
            </div>
          </div>
        </div>
      </div>
    </section>
    <Footer/>
    </>
  );
}

export default FAQSection;