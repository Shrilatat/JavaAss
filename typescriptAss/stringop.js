var strJoin = function (str) {
    var arr = [];
    for (var _i = 1; _i < arguments.length; _i++) {
        arr[_i - 1] = arguments[_i];
    }
    arr.sort();
    var op = arr.join(str);
    return op;
};
console.log(strJoin("#", "aa", "bbb", "ccc", "dd"));
