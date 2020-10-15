var x:number=7;
var y:number=3;
var pow:number=1;
power(x,y);
function power(x:number,y:number)
{
    for(var i=0;i<y;i++)
    {
        pow*=x;
    }
}
console.log(pow);
