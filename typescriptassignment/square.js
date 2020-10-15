function arraySquare(arr) {
    for (var i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * arr[i];
    }
    return arr;
}
var pass = [1, 2, 3, 4];
var squareArr = arraySquare(pass);
console.log(squareArr);
