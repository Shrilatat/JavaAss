var arr = [1, 2, 3, 4];
function square(arr) {
    for (var i = 0; i < arr.length; i++) {
        arr[i] = arr[i] * arr[i];
    }
    return arr;
}
console.log(square(arr));
