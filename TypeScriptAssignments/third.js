var arr = [1, 2, 3, 4, 5];
var func = function (temp1) {
    var avg;
    var sum = 0;
    for (var _i = 0, temp1_1 = temp1; _i < temp1_1.length; _i++) {
        var i1 = temp1_1[_i];
        sum = sum + i1;
    }
    function findMin(arr) {
        var len = arr.length, min = Infinity;
        while (len--) {
            if (Number(arr[len]) < min) {
                min = Number(arr[len]);
            }
        }
        console.log(min);
    }
    ;
    function findMax(arr) {
        var len = arr.length, max = -Infinity;
        while (len--) {
            if (Number(arr[len]) > max) {
                max = Number(arr[len]);
            }
        }
        console.log(max);
    }
    ;
    avg = sum / temp1.length;
    findMin(temp1);
    findMax(temp1);
    console.log(avg);
};
func(arr);
