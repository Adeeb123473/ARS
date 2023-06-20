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

app.post('/',function(require,response,next){
   const Seat=require.body.seats;
   const f_code=require.body.f_code;
   const gen=require.body.gendere;
   const name=require.body.namee;
   const quer="INSERT INTO webtic(name, gen, f_code, seats) VALUES (?,?,?,?)";
db.query(quer,[name,gen,f_code,Seat],(err,result)=>{
   if(err){ response.send({err:err}); }
   else{
    if(result>0){
        response.send(result)
    }else{
        response.send("Unsuccessfull Duplicate Entry")
    }
   }
});
// response.send("in login");
});


module.exports=app;