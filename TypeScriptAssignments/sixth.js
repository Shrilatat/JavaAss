var findProducts = /** @class */ (function () {
    function findProducts() {
        this.prods = [new findProduct("ROG", "1", 10000),
            new findProduct("Tuff", "2", 20000),
            new findProduct("Strix", "3", 30000),
            new findProduct("Zenbook", "4", 40000),
            new findProduct("Zephyrus", "5", 50000),
        ];
    }
    findProducts.prototype.findAllProducts = function () {
        for (var _i = 0, _a = this.prods; _i < _a.length; _i++) {
            var temp = _a[_i];
            console.log(temp);
        }
    };
    return findProducts;
}());
var findProduct = /** @class */ (function () {
    function findProduct(name, id, price) {
        this.Name_is = name;
        this.Id_is = id;
        this.Price_is = price;
    }
    return findProduct;
}());
var pr = new findProducts();
pr.findAllProducts();
