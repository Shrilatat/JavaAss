var num:number = 12345;
var sum:number =0;
for(var i=0;i<5;i++){
    console.log("itr")
    sum =sum + num%10;
    num=Math.floor(num/10);
}
console.log("Sum of digits is:"+sum);