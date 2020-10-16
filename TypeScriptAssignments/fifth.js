function doJoin(sep) {
    var str = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        str[_i - 1] = arguments[_i];
    }
    var temp = str.sort();
    console.log(temp.join(sep));
}
console.log(doJoin(" ", "a", "m", "i", "s", "h", "a"));
