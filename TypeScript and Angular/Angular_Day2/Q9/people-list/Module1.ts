export class Module {
    crowd : People[];
    
    constructor(){
        this.crowd = [new People("Kshitij","23","Male"),
                    new People("John","22","Male"),
                    new People("Emily","24","Female")];
    }
  }

export class People {
    name;
    age;
    gender;
    
    constructor(name, age, gender){
        this.name = name;
        this.age = age;
        this.gender = gender;
    }
  }
  
