var num = 12345;
var sum = 0;
while (num) {
    sum = sum + num % 10;
    num = num / 10;
}
console.log("sum is :" + sum);
