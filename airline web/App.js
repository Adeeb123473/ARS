import './App.css';
  import React, {useState, useEffect,Reducer, useReducer, createContext, useContext} from 'react';
import Axios from 'axios';
import {createRoot} from 'react-dom/client';


import logo from './images/logoair.png';
import { initialState,reducer } from './UseReducer';
import Home from '../src/Home'
import About from '../src/About'
import Contactus from '../src/Contactus'
import Footer from '../src/Footer'
import Table from '../src/Table'

export const UserContext=createContext()



function App() {
   
// table portion ends
  
  const [email,setEmail]=useState("");

  const [password,setPassword]=useState("");
  var[loginStatus,setLoginStatus]=useState(false)

var[nameup,setNameup]=useState("")
var[emailup,setEmailup]=useState("")
var[genderup,setGenderup]=useState("")
var[passup,setPassup]=useState("")

const submit=()=>{
  
Axios.post('http://localhost:9000/login',{
  email: email,
  pass: password,
}).then((response)=>{
if (response.data[0]) {
  // setLoginStatus(response.data[0].name)
  // setLoginStat=loginStatus
  // logstatus=='yes'
//  setyeslog=  Stateslog('yes')
  alert("Success")
  dispatch({type:"USER",payload:true})
  setNameup(response.data[0].name);
setGenderup(response.data[0].gender);
setLoginStatus(!loginStatus)
} else {
  alert("Unsuccess")
}
console.log(response.data[0])

});
  };
  const signup=()=>{
    Axios.post('http://localhost:9000/signup',{
      name: nameup,
      pass: passup,
      gen:genderup,
      email:emailup,
    }).then((response)=>{
      alert("success");
      console.log(response);
    });
      };


const logout=()=>{
  dispatch({type:"USER",payload:false})
}

const Lognav=()=>{

if(state){
  return(
    <div className='fa fa-user' onClick={{logout}} >Welcome, {nameup}</div> 
    )
}else{
  return(
  <>
  <div  className="fas fa-sign-in-alt" id="sign-in"  data-toggle="modal" data-target="#loginModal"></div>
  <div className="fa fa-user-plus" aria-hidden="true" id="register" data-toggle="modal" data-target="#modalRegisterForm"></div>  
  </>
    );
  }

}

const [state,dispatch]=useReducer(reducer,initialState)


  return (
    // context API
    <>
    {/* navabar starts */}
      <header className='header'>

<a href="#" className='logo'>
    {/* <img src="D:\reactair\client\images\logoair.png" alt="" /> */}
    <img src={logo} alt='' ></img>
<span className='ace'> airline.</span>
</a>
<UserContext.Provider value={{state,dispatch}}>
<nav className='navbar1'>
    <a href="#home">Home</a>
    <a href="#avaiFlight">Flight</a>
    <a href="#services">Services</a>
    <a href="#contact">Contact us</a>
</nav>

<div className="icons" value={{state,dispatch}} >
    <div className="fas fa-search" id="search-btn"></div>
   
   <Lognav />   
        <div className="fas fa-bars" id="menu-btn" ></div>

</div>
</UserContext.Provider>
</header>

{/* navabar ends */}

{/* HOme Sections starts */}
<Home />

{/* Home sections ends */}


{/* available flights table starts */}
{/* <Table /> */}
<div>
<h1 style={{"textAlign":"center"}} id="avaiFlight">Available Flights</h1>
<table className='table table-striped w-auto tabcenter' >
{/* <!--Table head--> */}
<thead>
    <tr>
      <th>f_code</th>
      <th>f_name</th>
      <th>Source</th>
      <th>Destination</th>
      <th>Time_Departure</th>
      <th>Date_Departure</th>
      <th>Seats</th>
    </tr>
  </thead>
  {/* <!--Table head--> */}

<Table logg={loginStatus} nam={nameup} genderr={genderup}/>   
{/* tavbole component */}
      
{/* table component ends  */}
</table>
</div>

{/* available flights table ends */}



            {/* about section starts */}
            <About />
         
{/* about section ends */}

{/* <!-- contactus  --> */}
<Contactus />

         {/* contactus ends */}


        {/* <!-- footer starts --> */}
         <Footer />

{/* footer section ends             */}

{/* Login form */}

<div  className="modal fade" id="loginModal" tabIndex="-1" role="dialog" aria-labelledby="exampleModalLabel" aria-hidden="true" >
        <div className="modal-dialog modal-dialog-centered" role="document">
          <div className="modal-content">
            <div className="modal-header border-bottom-0">
              <button type="button" className="close" data-dismiss="modal" aria-label="Close">
                <span aria-hidden="true">×</span>
              </button>
            </div>
            <div className="modal-body">
              <div className="form-title text-center">
                <h4>Login</h4>
              </div>
              <div className="d-flex flex-column text-center">
                <form>
                  <div className="form-group">
                    <input type="email" className="form-control" id="email1"placeholder="Your email address..."  onChange={(e)=> {
                      setEmail(e.target.value)
                    }}/>
                  </div>
                  <div className="form-group">
                    <input type="password" className="form-control" id="password1" placeholder="Your password..." onChange={(e)=> {
                      setPassword(e.target.value)
                    }}/>
                  </div>
                  <button type="button" className="btn btn-info btn-block btn-round" onClick={submit}>Login</button>
                </form>
                
                <div className="text-center text-muted delimiter">or use a social network</div>
                <div className="d-flex justify-content-center social-buttons">
                  <button type="button" className="btn btn-secondary btn-round" data-toggle="tooltip" data-placement="top" title="Twitter">
                    <i className="fab fa-twitter"></i>
                  </button>
                  <button type="button" className="btn btn-secondary btn-round" data-toggle="tooltip" data-placement="top" title="Facebook">
                    <i className="fab fa-facebook"></i>
                  </button>
                  <button type="button" className="btn btn-secondary btn-round" data-toggle="tooltip" data-placement="top" title="Linkedin">
                    <i className="fab fa-linkedin"></i>
                  </button>
                {/* </div> */}
              </div>
               </div>
             </div>
            <div className="modal-footer d-flex justify-content-center">
              <div className="signup-section">Not a member yet? <a href="#a" className="text-info"> Sign Up</a>.</div>
            </div>
        </div>
      </div>
    </div>

{/* signup form */}
<div className="modal fade" id="modalRegisterForm" tabindex="-1" role="dialog" aria-labelledby="myModalLabel"
  aria-hidden="true">
  <div className="modal-dialog" role="document">
    <div className="modal-content">
      <div className="modal-header text-center">
        <h4 className="modal-title w-100 font-weight-bold">Sign up</h4>
        <button type="button" className="close" data-dismiss="modal" aria-label="Close">
          <span aria-hidden="true">&times;</span>
        </button>
      </div>
      <div className="modal-body mx-3">
        <div className="md-form mb-5">
          <i className="fas fa-user prefix grey-text"></i>
          <input type="text" id="orangeForm-name" className="form-control validate" onChange={(e)=> {
                      setNameup(e.target.value)
                    }}/>
          <label data-error="wrong" data-success="right" for="orangeForm-name">Your name</label>
        </div>
        <div className="md-form mb-5">
          <i className="fas fa-envelope prefix grey-text"></i>
          <input type="email" id="orangeForm-email" className="form-control validate" onChange={(e)=> {
                      setEmailup(e.target.value)
                    }}/>
          <label data-error="wrong" data-success="right" for="orangeForm-email">Your email</label>
        </div>

        <div className="md-form mb-4">
          <i className="fas fa-lock prefix grey-text"></i>
          <input type="password" id="orangeForm-pass" className="form-control validate" onChange={(e)=> {
                      setPassup(e.target.value)
                    }}/>
          <label data-error="wrong" data-success="right" for="orangeForm-pass">Your password</label>
        </div>
        <div className="md-form mb-5">
          <i className="fas fa-user prefix grey-text"></i>
          <input type="text" id="orangeForm-name" className="form-control validate" onChange={(e)=> {
                      setGenderup(e.target.value)
                    }}/>
          <label data-error="wrong" data-success="right" for="orangeForm-name">Gender</label>
        </div>
      
        {/* <div className='checkbox'>
        <div className="form-check">
  <input className="male form-check-input" type="radio" name="exampleRadios" id="exampleRadios1" value="option1"  />
  <label className="form-check-label" for="exampleRadios1">
    Male
  </label>
</div>
<div className="form-check">
  <input className="female form-check-input" type="radio" name="exampleRadios" id="exampleRadios2" value="option2" />
  <label className="form-check-label" for="exampleRadios2">
    Female
  </label>
</div>
</div> */}
      </div>
      <div className="modal-footer d-flex justify-content-center">
        <button className="btn btn-deep-orange" onClick={signup}>Sign up</button>
      </div>
    </div>
  </div>
</div>

    </>
  );
}

export default App;
