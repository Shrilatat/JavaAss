var findPower=function (num1:number, num2:number):number
{
    var temp:number=1;
    for(var i=0; i<num2; i++)
    {
        temp = temp * num1;
    }
    return temp;
}

var ans:number=findPower(5,4);

console.log(ans);