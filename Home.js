import './App.css';
import React from 'react';
import home1 from './images/plane-main.png';

 const Home=()=>{
    return(

<section className="sec1" id="home">
                <div className="content">
                    <div>
                        <h1 >
                            are you<br />
                            ready for<br />
                            <span>take-off?</span>
                        </h1>
                        <p>
                            Lorem ipsum dolor sit amet consectetur, adipisicing elit. Aliquam similique dicta non
                            maxime, odit corrupti architecto eligendi. Accusamus, dignissimos aperiam!
                        </p>
                        <a href="#"  className="btn1 btn-primary1">learn more</a>

                    </div>
                </div>
    <img className="plane wow animate_animate animate_fadeIn" src={home1} alt="" />
            </section>

)}

export default Home;