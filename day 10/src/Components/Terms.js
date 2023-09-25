import React from 'react';
import '../styles/terms.css';
import Navigation from '../Components/Navbar.js';
import Footer from '../Components/Footer.js';


const Terms = () => {
  return (
    <>
      <Navigation />
      <main className="wrap">
    <section className="containert">
        <div className="container__heading">
            <h2 className="terms-heading">Terms & Conditions</h2>
        </div>
        <div className="container__content">
            <p className="terms-paragraph">Last Updated: 23/09/2023</p>
            <p className="terms-paragraph">
                Please read these Terms and Conditions carefully before using the
                Music-Mingle Application operated by US. By
                accessing or using the Music-Mingle Application, you agree to be bound
                by these Terms. If you do not agree to all these Terms, you may
                not use the Application.
            </p>
            <ul className="terms-list">
                <ul className="terms-list-item">Application Overview</ul >
                <p className="terms-paragraph">
                    The Music-Mingle Application connects music enthusiasts with a vast library of songs and playlists. Users can discover, create playlists, and interact with the music community.
                </p>
                <ul className="terms-list-item">User Accounts</ul>
                <p className="terms-paragraph">
                    Users must create an account to access certain features of the
                    Application. Users are responsible for maintaining the
                    confidentiality of their account credentials. Users must provide
                    accurate and up-to-date information during registration. Users
                    are responsible for all activities that occur under their
                    account.
                </p>
                <ul className="terms-list-item">Content Usage</ul>
                <p className="terms-paragraph">
                    Users may access and enjoy the content available on Music-Mingle for personal use. Unauthorized distribution or reproduction of music content is prohibited.
                </p>
                <ul className="terms-list-item">Privacy and Data Security</ul>
                <p className="terms-paragraph">
                    We prioritize user privacy and data security. Our Privacy Policy
                    outlines how we collect, use, and protect user data. By using
                    the Application, you agree to the practices described in our
                    Privacy Policy.
                </p>
                <ul className="terms-list-item">User Responsibilities</ul>
                <p className="terms-paragraph">
                    Users must use the Application responsibly and in compliance
                    with applicable laws and regulations. Users must not engage in
                    any fraudulent, abusive, or harmful activities on the
                    Application. Users must respect the privacy and rights of other
                    Users.
                </p>
                <ul className="terms-list-item">Payments and Subscriptions</ul>
                <p className="terms-paragraph">
                    While Music-Mingle offers free access to basic features, premium subscriptions may be available for an enhanced ad-free experience. Subscription details are provided within the app.
                </p>
                <ul className="terms-list-item">Termination</ul>
                <p className="terms-paragraph">
                    US reserves the right to terminate or suspend user
                    accounts at its discretion, with or without notice. Users may
                    terminate their accounts at any time by following the
                    Application's account closure procedure.
                </p>
                <ul className="terms-list-item">Intellectual Property</ul>
                <p className="terms-paragraph">
                    All content and intellectual property within Music-Mingle,
                    including music tracks and artwork, are protected by intellectual
                    property laws. Users may not reproduce, distribute, or create
                    derivative works based on the Application without prior written
                    permission.
                </p>
                <ul className="terms-list-item">Disclaimer</ul>
                <p className="terms-paragraph">
                    US does not endorse or guarantee the quality, safety,
                    or legality of music content available on Music-Mingle. Users use the
                    Application at their own risk.
                </p>
                <ul className="terms-list-item">Limitation of Liability</ul>
                <p className="terms-paragraph">
                    US shall not be liable for any indirect, incidental,
                    special, or consequential damages arising from the use of the
                    Application.
                </p>
                <ul className="terms-list-item">Governing Law</ul>
                <p className="terms-paragraph">
                    These Terms shall be governed by and construed in accordance
                    with the laws of the United States.
                </p>
                <ul className="terms-list-item">Changes to Terms</ul>
                <p className="terms-paragraph">
                    US reserves the right to modify these Terms at any
                    time. Updates will be posted on the Application, and continued
                    use of the Application constitutes acceptance of the modified
                    Terms.
                </p>
            </ul>
            <p className="terms-paragraph">
                For questions or concerns regarding these Terms, please contact us
                at musicmingle@gmail.com.
            </p>
        </div>
        <div className="containert__nav">
            <p className='ack'>
                By using Music-Mingle, you acknowledge that you have
                read and understood these Terms and agree to be bound by them.
            </p>
            <a className="button-29" href="/homenew">
                Accept & Continue
            </a>
        </div>
    </section>
</main>
<Footer />

    </>
  );
};

export default Terms;