var Products = /** @class */ (function () {
    function Products() {
        this.prods = [new product("TV", "1", 2000),
            new product("phone", "2", 1000),
            new product("laptop", "3", 4000)
        ];
    }
    Products.prototype.getAllProducts = function () {
        for (var _i = 0, _a = this.prods; _i < _a.length; _i++) {
            var p = _a[_i];
            console.log(p);
        }
    };
    return Products;
}());
var product = /** @class */ (function () {
    function product(name, id, price) {
        this.name = name;
        this.id = id;
        this.price = price;
    }
    return product;
}());
var pr = new Products();
pr.getAllProducts();
