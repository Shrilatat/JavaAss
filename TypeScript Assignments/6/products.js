"use strict";
exports.__esModule = true;
exports.Product = void 0;
var Product = /** @class */ (function () {
    function Product(productName, productId) {
        this.productName = productName;
        this.productId = productId;
    }
    Product.prototype.getProduct = function () {
        console.log("productId : " + this.productId + " ProductName :" + this.productName);
    };
    return Product;
}());
exports.Product = Product;
