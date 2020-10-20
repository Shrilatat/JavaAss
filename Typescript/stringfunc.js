function strJoin(s) {
    var str = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        str[_i - 1] = arguments[_i];
    }
    var concat = "";
    for (var _a = 0, str_1 = str; _a < str_1.length; _a++) {
        var ind = str_1[_a];
        concat = concat + ind + s;
    }
    console.log(concat);
}
strJoin("#", "Rita", "Gita", "Sita");
