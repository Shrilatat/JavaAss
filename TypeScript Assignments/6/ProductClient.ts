import {Product} from "./products"

var arrProd: Product[] = []; //array of objects

arrProd.push(new Product("Book",1));
arrProd.push(new Product("Pens",2));

function printAllProducts(arr: Product[]):void{
    for(let product of arr){
        console.log(product.getProduct());
    }
}

console.log(printAllProducts(arrProd));

