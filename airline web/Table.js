import './App.css';
  import React, {useState, useEffect} from 'react';
import Axios from 'axios';
const Table=(props)=>{
  var[flightList,setflightList]=useState([])
  useEffect(()=>{
      Axios.post('http://localhost:9000/table').then((response)=>{
        setflightList(response.data)
      });
      })
      const bookTic=(f_code,seats)=>{
      if(props.logg){
          const noSeat=prompt("Enter No Seats")
          Axios.put('http://localhost:9000/bookTic',{
            f_code: f_code,
            numSeat: noSeat,
            seats:seats
          }).then((response)=>{
          newfunc(f_code,noSeat);
          })
      }
         else{
        alert("please login first")
      }
    }

    const newfunc=(f_code,noSeat)=>{
      Axios.post('http://localhost:9000/newTic',{
        f_code: f_code,
        seats:noSeat,
        namee:props.nam,
        gendere:props.genderr
      }).then((response)=>{
        if(response){
          console.log(response)
          alert("Success");
        }else{
          alert("UnSuccess")
        }
      })
    }
  
  return(
  <>
    {flightList.map((val)=>{
      return(
      <tr class="table-info">
            <th scope="row">{val.f_code}</th>
            <td>{val.f_name}</td>
            <td>{val.src}</td>
            <td>{val.dst}</td>
            <td>{val.time_depar}</td>
            <td>{val.date_depar}</td>
            <td>{val.seats}</td>
            <td><button className='tabbutton' id="sign-in"  data-toggle="modal" onClick={()=>{
              bookTic(val.f_code,val.seats)}} >Book Now</button></td>
          </tr>
      )
          })}   
  </>
  )   
}
export default Table;
