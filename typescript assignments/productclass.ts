export class product{
    name:string;
    price:number;

    constructor(name:string, price:number){
        this.name=name
        this.price=price
    }

    printProduct():void{
        console.log(`[ ${this.name} : ${this.price} ]`)
    }
}