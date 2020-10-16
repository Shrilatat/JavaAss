class People{
    name:string;
    age:number;
    gender:string;

    constructor(name,age,gender)
    {
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
  }

  export class Module1{
      peopleArr: People[];
      constructor(){
          this.peopleArr=[
              new People("Pooja",21, "Female"),
              new People("Siya",23, "Female"),
              new People("Sid",20, "Male")
          ];

      }
  }