class Product{
    id:number;
    name:string;

    constructor(id:number, name:string){
        this.id=id;
        this.name=name;
    }
}

class Products{
    public displayAllProducts(...prods:Product[]){
        console.log("Product list :\n");
        for(var x of prods){
            
            console.log("ID: " + x.id + "\n");
            console.log("Name: " + x.name + "\n");
        }
    }
}

var products = new Products();
products.displayAllProducts(new Product(101,"aaa"),new Product(102,"bbb"));