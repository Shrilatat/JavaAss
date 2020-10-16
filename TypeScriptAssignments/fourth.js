var findSquare = function (arr) {
    var ans = [];
    for (var i = 0; i < arr.length; i++) {
        ans[i] = Math.pow(arr[i], 2);
    }
    return ans;
};
var arr = [1, 2, 3, 4, 5];
var sqr = findSquare(arr);
console.log(sqr);
