var x:number=2 , y:number=3;


function power(x:number , y:number)
{
 if (y == 0) 
        return 1; 
    else if (y%2 == 0) 
        return power(x, y/2)*power(x, y/2); 
    else
        return x*power(x, y/2)*power(x, y/2); 

}

console.log(power(x,y));