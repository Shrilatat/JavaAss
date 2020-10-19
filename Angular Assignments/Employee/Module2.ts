export class Module {
  arrEmp;
  constructor() {

    this.arrEmp = [new employee("7","Ronaldo","20000","Juventus"),
    new employee("10","Messi","20000","Barcelona"),
    new employee("1","Buffon","10000","Juventus"),
    new employee("11","Ozil","2000","Arsenal")]
  }
  
}

export class employee {
  empno;
  ename;
  salary;
  designation;
  constructor(empno,ename,salary,designation) {
    this.empno = empno;
    this.ename = ename;
    this.salary=salary;
    this.designation=designation;
  }
}