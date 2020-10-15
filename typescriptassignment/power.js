var x = 7;
var y = 3;
var pow = 1;
power(x, y);
function power(x, y) {
    for (var i = 0; i < y; i++) {
        pow *= x;
    }
}
console.log(pow);
