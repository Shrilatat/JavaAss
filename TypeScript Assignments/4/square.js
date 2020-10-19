var arr;
arr = [1, 2, 3];
var sqrArray;
sqrArray = [];
function sqr(arr) {
    for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
        var ele = arr_1[_i];
        sqrArray.push(ele * ele);
    }
    return sqrArray;
}
console.log(sqr(arr));
