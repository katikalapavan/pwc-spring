var express = require("express");
var bp = require("body-parser");
var _ = require("underscore");
var app = express();
//app.use(bp.json());
app.use(bp.urlencoded({extended:true}))
var users = [
    
];
uid = 1;
app.get("/",(req,res)=>{
    res.render('index.ejs',{udata:users})
})
app.get("/loadusers", (req, res) => {
  res.send(users)
  
});

app.post("/adduser", (req, res) => {
  var data = req.body;
  data.id = uid++;
  users.push(data);
  console.log(users);
  
  res.render('index.ejs',{udata:users});
});

app.get("/login",(req,res)=>{
    res.render('login.ejs')
})

app.post("/login",(req,res)=>{

    var username= req.body.uname
    var password= req.body.pass

var data=_.findWhere(users,{uname:username},{pass:password})
if(data){
    res.render('welcome.ejs')
}else{
    res.render('login.ejs')
}

})



app.get("/loadusers/:id", (req, res) => {
  var lid = parseInt(req.params.id);
  var mtd = _.findWhere(users, { id: lid });
  if (mtd) {
    res.json(mtd);
  } else {
    res.status(404).send();
  }
});
app.delete("/deleteuser/:id", (req, res) => {
  var lid = parseInt(req.params.id);
  var mtd = _.findWhere(users, { id: lid });
  if (mtd) {
    users = _.without(users, mtd);
    res.json(mtd);
  } else {
    res.status(404).send();
  }
});

//      localhost:4000/deleteuser/3

app.listen(4000, () => {
  console.log("server.is ready");
});