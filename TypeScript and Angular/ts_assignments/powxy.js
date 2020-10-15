var x = 2;
var y = 3;
function powxy(x, y) {
    var ans = 1;
    for (var i = 0; i < y; i++) {
        ans = ans * x;
    }
    console.log(ans);
}
powxy(x, y);
