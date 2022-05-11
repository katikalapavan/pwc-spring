var weather = require('./weatherapp.js')
var location=require('./location.js')
var argv=require('yargs')
.option('location',{
    type:'string',
    alias:'l'
}).help('helo')
.argv

if(typeof argv.l==='string' && argv.length>0){
    weather(argv.location,function(callback){
        console.log(callback);
    })

}else{
    location(function(location){
        weather(location.data.city,function(callback){
            console.log(callback);
        })
    })
}