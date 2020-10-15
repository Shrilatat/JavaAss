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
        console.log("The product list is : \n");
        for(var x of prods){
            
            console.log("ID: "+x.id+"\n");
            console.log("Name: "+x.name+"\n");
        }
    }
}

var products = new Products();
products.displayAllProducts(new Product(1,"a"),new Product(2,"b"));