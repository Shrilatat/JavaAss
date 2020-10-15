class Products{
    prods;
    constructor(){
        this.prods=[new product("TV","1",2000),
        new product("phone","2",1000),
        new product("laptop","3",4000)
                    ]
    }

    getAllProducts(){
        for(var p of this.prods){
            console.log(p);
        }
    }

}

class product{
    name;
    id;
    price;
    constructor(name,id,price){
        this.name=name;
        this.id=id;
        this.price=price;
    }
}

var pr:Products=new Products();
pr.getAllProducts();