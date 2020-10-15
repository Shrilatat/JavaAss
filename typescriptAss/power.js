var fun = function (x, y) {
    var value = 1;
    for (var i = 0; i < y; i++) {
        value = value * x;
    }
    return value;
};
var ans = fun(2, 2);
console.log(ans);
