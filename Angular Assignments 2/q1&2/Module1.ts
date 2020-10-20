class People {
  uname:string;
  age:number;
  gender:string;

  constructor(uname:string,age:number,gender:string){
    this.uname=uname;
    this.age=age;
    this.gender=gender;
  }
}

export class Module{
  peoples:People[]=[new People("A",12,"Male"),new People("B",23,"Female"),new People("C",43,"Female")];
  constructor(){}
}