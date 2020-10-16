  
  export class employee {
    empno;ename;sal;desig;
    constructor(empno,ename,sal,desig) {
      this.empno = empno;
      this.ename = ename;
      this.sal=sal;
      this.desig=desig;
    }
  }
  export class Module {
    items
    constructor() {
  
      this.items = 
      [new employee("1","sid","5000","SE"),
      new employee("2","adi","40000","JE"),
      new employee("3","partik","60000","Manager"),
      new employee("4","vijay","60000","Manager")]
    }
    
  } 