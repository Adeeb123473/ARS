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

app.post('/',function(req,response,next){
    const name=req.body.name;
    const review=req.body.review;
    const quee="INSERT INTO review (name, review) VALUES (?,?)"
db.query(quee,[name,review],(err,result)=>{
    if(err){ response.send({err:err}); }
    else{
     if(result>0){
         response.send(result)
     }else{
         response.send("Unsuccessfull Duplicate Entry")
     }
 
    }
});
});


module.exports=app;