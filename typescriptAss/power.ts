var fun=function (x:number, y:number):number{
    var value:number=1;
    for(var i=0;i<y;i++){
        value=value*x;
    }
    return value;
}
var ans:number=fun(2,2)
console.log(ans);