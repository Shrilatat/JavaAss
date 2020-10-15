"use strict";
exports.__esModule = true;
var products_1 = require("./products");
var arrProd = [];
arrProd.push(new products_1.Product("Book", 1));
arrProd.push(new products_1.Product("Pens", 2));
function printAllProducts(arr) {
    for (var _i = 0, arr_1 = arr; _i < arr_1.length; _i++) {
        var product = arr_1[_i];
        console.log(product.getProduct());
    }
}
console.log(printAllProducts(arrProd));
