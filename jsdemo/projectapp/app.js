var express=require('express')
var bp=require('body-parser')
var app=express()
app.use(bp.json())
var users=[
 //   {id:101,pname:'pavan',mname:'raju',budject:5000,loc:'nellore'},
   
   
]
uid=1
app.use(express.static('public'))
app.get("/loadusers",(req,res)=>{
//res.json(users)
res.send(users)
})
app.post('/adduser',(req,res)=>{
    var data=req.body
    data.id=uid++;
    users.push(data)
    res.send('user is added' +data)

})
app.get('/loaduser/:id',(req,res)=>{
    var lid=parseInt(req.params.id)
   // console.log(id);
   var mtd
   user.forEach(function(td){
       if(lid==td.id){
           mtd=td
       }
   })
   if(mtd){
       res.json(mtd)
   }else{
       res.status(401).send()
   }
})
app.listen(4000,()=>{
    console.log('server.is ready');
})