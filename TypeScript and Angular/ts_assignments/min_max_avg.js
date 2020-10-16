var list = [1, 2, 3, 4, 5, 6, 7, 8, 9];
function min_max_avg(number) {
    number.sort();
    var min = number[0];
    var max = number[number.length - 1];
    var sum = 0;
    for (var _i = 0, number_1 = number; _i < number_1.length; _i++) {
        var i = number_1[_i];
        sum = sum + i;
    }
    var average = sum / number.length;
    console.log("Min is " + min);
    console.log("Max is " + max);
    console.log("Average is" + average);
}
min_max_avg(list);
