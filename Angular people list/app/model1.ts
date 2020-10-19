export class Module {
    items
    constructor() {
  
      this.items = [new people("aaa","20","female"),
      new people("bbb","21","female"),
      new people("ccc","22","male")]
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
  
  