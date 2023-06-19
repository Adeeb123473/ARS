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
    // const email=require.body.email
    // const pass=require.body.pass
    const quer="SELECT * FROM flight"
    // const quer="INSERT INTO "
    // const quer="INSERT INTO Login (username, password) VALUES (?,?)";
db.query(quer,(err,result)=>{
    // if(err){
    //     response.send({err: err})
    // }else{
        response.send(result)
        // console.log(result)
    // if(result){
            // }else{
    //     response.send("Invalid Credentials")
    // }
// if (result >1) {
//     response.send("success Login")
// } else {
//     response.send("UnSuccesful Login")
// }
    // }
});
});


module.exports=app;