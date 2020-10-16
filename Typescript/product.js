var Product = /** @class */ (function () {
    function Product(prod) {
        this.prod = prod;
    }
    return Product;
}());
var Products = /** @class */ (function () {
    function Products() {
    }
    Products.prototype.display = function () {
        var prods = [];
        for (var _i = 0; _i < arguments.length; _i++) {
            prods[_i] = arguments[_i];
        }
        console.log("Products are");
        for (var _a = 0, prods_1 = prods; _a < prods_1.length; _a++) {
            var i = prods_1[_a];
            console.log(i.prod);
        }
    };
    return Products;
}());
var product = new Products();
product.display(new Product("first"), new Product("second"), new Product("third"));
