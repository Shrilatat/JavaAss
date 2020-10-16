export class Module {
    items
    constructor() {
  
      this.items = [new people("Durva","22","Female"),
      new people("Shubhi","23","Female"),
      new people("Maithely","20","Female")]
    }
    
  }
  
  export class people {
    name;
    age;
    gender;
    constructor(name,age,gender) {
      this.name = name;
      this.age = age;
      this.gender=gender;
    }
  }
  