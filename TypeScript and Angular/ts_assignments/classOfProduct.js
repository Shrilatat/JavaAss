// Question 6
var Product = /** @class */ (function () {
    function Product(prodName, prodReview) {
        this.productName = prodName;
        this.productReview = prodReview;
    }
    return Product;
}());
var myArray = [];
var p1 = new Product("Phone", "Good");
var p2 = new Product("Laptop", "Not Bad");
var p3 = new Product("Earphone", "Not Good");
myArray.push(p1);
myArray.push(p2);
myArray.push(p2);
myArray.forEach(function (value) {
    console.log(value);
});
