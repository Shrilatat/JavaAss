
function pow( x,  y){
   var value=1;
    for(var i=0;i<y;i++)
    { 
        
         value=value*x;
        
    }
    return value;
}

var x=2;
var y=3;
var num=pow(x,y);
console.log(num);