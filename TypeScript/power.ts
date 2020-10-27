var x:number=3;
var y:number=6;

function power(x, y) 
{ 
    if (y == 0) 
        return 1; 
    else{
    for (let index = 0; index < y; index++) {
        x=x+x;
        }
        console.log(x) 
    }
} 
