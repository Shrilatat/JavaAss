function strJoin(str1, str2, str3, str4) {
    var out = "";
    var out = out.concat(str1);
    var out = out.concat(str2);
    var out = out.concat(str1);
    var out = out.concat(str3);
    var out = out.concat(str1);
    var out = out.concat(str4);
    return out;
}
var outStr = strJoin("#", "sid", "adi", "pratik");
console.log(outStr);
