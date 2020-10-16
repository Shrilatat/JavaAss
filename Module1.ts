export class People{
  name;
  age;
  gender;
  constructor(name,age,gender){
    this.name=name
    this.age=20;
    this.gender=gender;
  }
}

export class Modules{
  details:any[];
  constructor(){
    this.details=[new People("vishnu",20,"male"),new People("rohan",20,"male")];
  }
}