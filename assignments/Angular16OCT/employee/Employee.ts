export class Emp {
  values
  constructor() {

    this.values = [new employee(101,"Aditi",50000,"Manager"),
    new employee(102,"Bhavya",45000,"SDE"),
    new employee(103,"Bharat",30000,"Developer"),new employee(104,"Mauli",40000,"Manager")];
  }

}

export class employee {
  empNo;
  eName;
  eSal;
  eDesig;
  constructor(empno,ename,sal,desig) {
    this.empNo = empno;
    this.eName = ename;
    this.eSal=sal;
    this.eDesig=desig;
  }
}