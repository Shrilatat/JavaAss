export class Module {
  items
  constructor() {

    this.items = [new employee("1","Pooja","50000","TSE"),
    new employee("2","Riddhi","29000","TSE"),
    new employee("3","Siya","40000","SSE"),
    new employee("4","Soham","20000","SE")]
  }

}

export class employee {
  empno;
  ename;
  sal;
  desig;
  constructor(empno,ename,sal,desig) {
    this.empno = empno;
    this.ename = ename;
    this.sal=sal;
    this.desig=desig;
  }
}