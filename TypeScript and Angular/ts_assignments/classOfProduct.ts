// Question 6

class Product{
    productName:string;
    productReview:string;

    constructor(prodName: string,prodReview: string){
        this.productName = prodName;
        this.productReview = prodReview;
    }
}

let myArray : Array<Product> = [];

let p1 = new Product("Phone","Good");
let p2 = new Product("Laptop","Not Bad");
let p3 = new Product("Earphone","Not Good");

myArray.push(p1);
myArray.push(p2);
myArray.push(p2);

myArray.forEach(function(value){
    console.log(value);
});