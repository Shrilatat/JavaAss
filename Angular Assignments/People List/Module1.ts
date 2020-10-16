export class People{
  name;
  age;
  gender;

  constructor(name,age,gender) { 
    this.name= name;
    this.age=age;
    this.gender=gender;

  }
}

export class Module1{

  arrPeople;

  constructor(){
    this.arrPeople=[new People("Pushkar","23","Male")]
  } 
}
