var num:number = 24680;
var sum:number =0;
while(num){
    sum =sum + num%10;
    num=Math.floor(num/10);
}
console.log("Sum of digits is:" + sum);