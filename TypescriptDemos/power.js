"use strict";
exports.__esModule = true;
exports.pow = void 0;
var result = 1;
function pow(x, y) {
    for (var i = 0; i < y; i++)
        result *= x;
    return result;
}
exports.pow = pow;
