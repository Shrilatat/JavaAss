class People{
    name:string;
    age:number;
    gender:string;

    constructor(name,age,gender){
        this.name=name;
        this.age=age;
        this.gender=gender;
    }
}


export class Module1{
    people_arr : People[];
    constructor(){
        this.people_arr=[
            new People("Ambrose",30,"male"),
            new People("John Wick",35,"male"),
            new People("Alice",27,"female")
        ];
    }
}