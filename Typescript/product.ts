class Product
{
    prod:string;
constructor(prod:string)
{
    this.prod=prod;
}
}

class Products
{
public display(...prods:Product[])
{
    console.log("Products are");
    for(var i of prods)
    {
        console.log(i.prod);
    }
}
}

var product = new Products();
product.display(new Product("first"), new Product("second") , new Product("third"));