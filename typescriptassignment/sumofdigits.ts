var num:number=12345;
var sum:number=0;
for(var i=0;i<5;i++)
{
   // console.log(num%10);
    //console.log(sum);
 var m=num%10;
 sum=sum+m;
 //console.log(sum);
    num=Math.floor(num/10);
    
}
console.log(sum);