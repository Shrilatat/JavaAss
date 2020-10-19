var arr;
arr = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
function arrayOperations(arr) {
    var min = arr[1];
    var max = arr[1];
    var sum = 0;
    for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
        var num = arr_1[_i];
        if (num > max) {
            max = num;
        }
        if (num < min) {
            min = num;
        }
        sum = sum + parseInt(num);
        console.log(num);
    }
    var length = arr.length;
    var avg = sum / length;
    console.log("min :" + min);
    console.log("max :" + max);
    console.log("avg :" + avg);
}
console.log(arrayOperations(arr));
