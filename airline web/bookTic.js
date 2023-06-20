const express=require('express');
const app=express();
const bodyParser=require('body-parser');
const Cors=require('cors');
const mySql=require('mysql');
const { response } = require('express');
// var router=express.Router()


const db=mySql.createPool({
    host:"localhost",
    user:"root",
    password:"",
    database:"project4"
});

app.use(express.json());
app.use(bodyParser.urlencoded({extended:true}));
app.use(Cors());

// app.post('/',function(require,response,next){
//    const email=require.body.email;
//    const pass=require.body.pass;
//    const quer="INSERT INTO login (username, password) VALUES (?,?)";
// db.query(quer,[email,pass],(err,result)=>{
//     console.log(err);
// });
// // response.send("in login");
// });

app.put('/',function(req,response,next){
    const f_code=req.body.f_code;
    const seats=req.body.seats;
    const numSeat=req.body.numSeat;
    // const review=req.body.review;
    var setnewseat=seats-numSeat
    const quee="UPDATE flight SET seats=? WHERE f_code=?"
db.query(quee,[setnewseat,f_code],(err,result)=>{
    // if(err){ response.send({err:err}); }
    // else{
     if(result){
         response.send(result)
     }else{
         response.send("Unsuccessfull")
     }
 
    // }

    console.log(result)
});
});


module.exports=app;