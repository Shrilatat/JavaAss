export class People {
  name;
  age;
  gender;

  constructor(name,age,gender) {
    
    this.name=name;
    this.age=age;
    this.gender=gender;
    }
   
}

export class myMod {
  pplArr;

  constructor() {
    this.pplArr = [new People("Aditi", 22,"Female"),
                  new People("Bhavya", 22,"Male"),
                  new People("Bharat",22,"Male")];
  }

}
