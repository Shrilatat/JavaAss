var num = 12345;
function sumof5(num) {
    var sum = 0;
    for (var i = 0; i < 5; i++) {
        sum = sum + num % 10;
        num = Math.floor(num / 10);
    }
    console.log(sum);
}
sumof5(num);
