function pow(x, y) {
    var temp = 1;
    if (y == 0)
        return 1;
    else {
        while (y != 0) {
            temp = temp * x;
            y--;
        }
    }
    return temp;
}
console.log(pow(5, 4));
