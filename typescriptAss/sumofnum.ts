var num:number=56478;
var sum:number=0;
for(var i=0;i<5;i++){
    sum=sum+num%10;
    num=Math.floor(num/10);
}
console.log(sum)