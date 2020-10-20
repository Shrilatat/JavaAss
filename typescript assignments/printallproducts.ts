import {product} from "./productclass";
class Products{
    list:product[]

    constructor(list:product[]){
        this.list = list
    }

    printAllProducts():void{
        for(var prod of this.list)
            prod.printProduct()
    }
}

var productslist : product[] = [new product("laptop",50000),new product("mobile",20000),new product("tv",30000)] ;
var myproducts = new Products(productslist)
myproducts.printAllProducts()