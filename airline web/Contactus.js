// import logo from './logo.svg';
import './App.css';
// import './index.css';
// import React from 'react';
import React, {useState} from 'react';
import Axios from 'axios';


const Contactus =()=>{
    const [name,setName]=useState("");
    const[review,setReview]=useState("");
    const submitReview=()=>{
        Axios.post('http://localhost:9000/review',{
          name: name, review: review,
        }).then((response)=>{
          alert("success")
          console.log(response)
        })
      };
          



return(
    <>
    <section className="headcontact" id="contact">
    <h1>Contact us</h1>
</section>
{/* <!-- <section class="bodycontact"> --> */}
<section id="form">

<div className="fish" id="fish"></div>
<div className="fish" id="fish2"></div>

<form id="waterform" method="post">

<div className="formgroup" id="name-form">
    <label htmlFor="name">Your name*</label>
    <input type="text" id="name" name="name" onChange={(e)=> {
          setName(e.target.value)
        }}/>
</div>

<div className="formgroup" id="email-form">
    <label htmlFor="email">Your e-mail*</label>
    <input type="email" id="email" name="email" />
</div>

<div className="formgroup" id="message-form">
    <label htmlFor="message">Your message</label>
    <textarea id="message" name="message" onChange={(e)=> {
          setReview(e.target.value)
        }}></textarea>
</div>

    <input type="submit" value="Send your message!" onClick={submitReview} />
</form>
</section>
{/* <!-- </section> --> */}
</>
)}
export default Contactus;