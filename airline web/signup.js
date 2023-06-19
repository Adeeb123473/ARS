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
   const email=require.body.email;
   const pass=require.body.pass;
   const gen=require.body.gen;
   const name=require.body.name;
   const quer="INSERT INTO regcust (name, gender, email, pass) VALUES (?,?,?,?)";
db.query(quer,[name,gen,email,pass],(err,result)=>{
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