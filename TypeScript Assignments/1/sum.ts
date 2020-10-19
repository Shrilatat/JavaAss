var num: number = 12345;
var sum = 0;
while(num){
  sum = sum + num%10;
  num = Math.floor(num/10);
}
console.log("sum is :" + sum);