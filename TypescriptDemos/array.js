"use strict";
exports.__esModule = true;
exports.arrayOp = void 0;
function arrayOp(arr) {
    var mn = Number.NEGATIVE_INFINITY;
    var mx = Number.POSITIVE_INFINITY;
    var sum = 0;
    for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
        var i = arr_1[_i];
        sum += i;
        mn = Math.min(mn, i);
        mx = Math.max(mx, i);
    }
    console.log(mn + " " + mx + " " + sum);
}
exports.arrayOp = arrayOp;
