import React from 'react';
import '../styles/policy.css';
import Navigation from '../Components/Navbar.js';
import Footer from '../Components/Footer.js';


const Privacy = () => {
  return (
    <>
      <Navigation />
      <main className="wrape">
        <section className="containerpolicy">
          <div className="container__heading">
            <h2 className='polinew'> Privacy Policy</h2>
          </div>
          <div className="container__content">
          <p>
    Effective Date: [23/09/2023]
    <br/><br/>
    Welcome to Music-Mingle, provided by US. <br/>We are committed to protecting your privacy. This Privacy Policy is designed to help you understand how we collect, use, disclose, and safeguard your personal information. By accessing or using the App, you agree to the terms of this Privacy Policy.
    <br/><br/>
    <span className="iconpolicy1">Information We Collect</span> 
    <br/>
    <span className="iconpolicy1">Personal Information</span> 
    <br/>
    - Account Information: We collect your name, email address, and date of birth to personalize your experience, create and manage your account.
    <br/>
    - Music Preferences: We collect information about the genres, artists, and songs you like to tailor your music recommendations.
    <br/>
    - Payment Information: If you subscribe to our premium service, we may collect payment card details and billing information.
    <br/><br/>
    <span className="iconpolicy1">Automatically Collected Information</span>
    <br/>
    - Device Information: We collect information about your device, including its type, operating system, and unique device identifiers.
    <br/>
    - Usage Information: We gather data about how you use the App, such as the songs you listen to, playlists you create, and your interactions with the app features.
    <br/>
    - Log Data: We collect server logs, which may include your IP address, browser type, and access times.
    <br/><br/>
    <span className="iconpolicy1"> How We Use Your Information</span> 
    <br/>
    <span className="iconpolicy1"> We use the collected information for the following purposes:</span> 
    <br/>
    - Providing Music Services: To offer and improve our music streaming services.
    <br/>
    - Personalization: To create personalized playlists, recommendations, and features tailored to your music preferences.
    <br/>
    - Communication: To notify you about updates, new music releases, and promotions.
    <br/>
    - Payment Processing: To process payments for premium subscriptions and billing-related activities.
    <br/>
    - Analytics: To analyze usage patterns and improve the App's music discovery features.
    <br/><br/>
    <span className="iconpolicy1">Data Sharing and Disclosure</span> 
    <br/>
    <span className="iconpolicy1">We may share your information with:</span> 
    <br/>
    - Music Licenses: Third-party music licensors and content providers to ensure a wide range of music is available on our platform.
    <br/>
    - Service Providers: Third-party service providers who assist us in delivering our music streaming services.
    <br/>
    - Legal Requirements: When required by law or in response to legal requests.
    <br/><br/>
    <span className="iconpolicy1">Your Choices</span>
    <br/>
    - Account Settings: You can review and update your account information and preferences within the App.
    <br/>
    - Communication Preferences: You can opt in or out of receiving promotional emails and notifications.
    <br/><br/>
    <span className="iconpolicy1">Security</span> 
    <br/>
    We employ advanced security measures to protect your information. However, no data transmission over the internet or method of electronic storage is entirely secure.
    <br/><br/>
    <span className="iconpolicy1">Children's Privacy</span>
    <br/>
    The App is not intended for use by individuals under the age of 13. We do not knowingly collect personal information from children.
    <br/><br/>
    <span className="iconpolicy1">Changes to this Privacy Policy</span>
    <br/>
    We may update this Privacy Policy periodically to reflect changes in our services and practices. Please review it regularly for any changes.
    <br/><br/>
    <span className="iconpolicy1">Contact Us</span>
    <br/>
    If you have questions or concerns about this Privacy Policy, please contact us at [Contact Information].
    <br/><br/>
    [End of Privacy Policy]
    <br/>
</p>

          </div>
        </section>
      </main>
      <Footer />
    </>
  );
};

export default Privacy;