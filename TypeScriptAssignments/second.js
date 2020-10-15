var findPower = function (num1, num2) {
    var temp = 1;
    for (var i = 0; i < num2; i++) {
        temp = temp * num1;
    }
    return temp;
};
var ans = findPower(5, 4);
console.log(ans);
