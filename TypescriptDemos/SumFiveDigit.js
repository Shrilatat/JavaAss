var num = 12345;
var temp = num;
var sum = 0;
while (temp != 0) {
    var digit = temp % 10;
    sum += digit;
    temp = Math.floor(temp / 10);
}
console.log(sum);
