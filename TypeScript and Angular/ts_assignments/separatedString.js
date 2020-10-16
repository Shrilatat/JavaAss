var arrayOfStrings = ["hello", "this", "is", "a", "sentence"];
function strJoin(separator, myArray) {
    var myStr = myArray.join(separator);
    console.log(myStr);
}
strJoin(",", arrayOfStrings);
