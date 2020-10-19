"use strict";
exports.__esModule = true;
exports.sumSquares = void 0;
function sumSquares(N) {
    var sum = 0;
    for (var i = 0; i <= N; i++) {
        if (i % 2 == 0) {
            sum += i;
        }
    }
    return sum;
}
exports.sumSquares = sumSquares;
