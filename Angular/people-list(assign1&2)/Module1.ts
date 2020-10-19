 export class People{
name:string;
age:number;
gender:string;

    constructor(name,age,gender)
    {
        this.name=name;
        this.age=age;
        this.gender=gender;
    }

}

export class Module{
    people=[new People("Sid",21,"Male"),new People("Adi",22,"Male")];
    constructor (){

    }

}