class findProducts{
    prods;
    constructor(){
        this.prods=[new findProduct("ROG","1",10000),
        new findProduct("Tuff","2",20000),
        new findProduct("Strix","3",30000),
        new findProduct("Zenbook","4",40000),
        new findProduct("Zephyrus","5",50000),
                    ]
    }

    findAllProducts(){
        for(var temp of this.prods){
            console.log(temp);
        }
    }

}

class findProduct{
    Name_is;
    Id_is;
    Price_is;
    constructor(name,id,price){
        this.Name_is=name;
        this.Id_is=id;
        this.Price_is=price;
    }
}

var pr:findProducts=new findProducts();
pr.findAllProducts();