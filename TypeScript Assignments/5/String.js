function strJoin(sep) {
    var allOthers = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        allOthers[_i - 1] = arguments[_i];
    }
    var sorted = allOthers.sort();
    console.log(sorted);
    var temp;
    temp = sorted.join(sep);
    return temp;
}
console.log(strJoin("#", "Pushkar", "Rajaram", "Ladkat"));
