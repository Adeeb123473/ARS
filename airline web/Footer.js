// import logo from './logo.svg';
import './App.css';
// import './index.css';
import React from 'react';



const Footer=()=>{
    return(
        <section className="footer">

        <div className="share">
            <a href="#" className="fab fa-facebook-f"></a>
            <a href="#" className="fab fa-twitter"></a>
            <a href="#" className="fab fa-instagram"></a>
            <a href="#" className="fab fa-linkedin"></a>
            <a href="#" className="fab fa-pinterest"></a>
        </div>
    
        <div className="links">
            <a href="#home" > home</a>
            {/* <a href="#deals">deals</a> */}
            <a href="#avaiFlight">Flight</a>
            <a href="#services">Services</a>
            <a href="#contact">ContactUs</a>
        </div>
    
        <div className="credit">created by <span>team ace</span> | all rights reserved</div>
    
    </section>

    )
}
export default Footer;