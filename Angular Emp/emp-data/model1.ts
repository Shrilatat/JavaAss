export class Module {
    items
    constructor() {
  
      this.items = [new employee("101","aaa","1234","SDE1"),
      new employee("102","bbb","4567","SDE2"),
      new employee("103","ccc","2345","Training"),
      new employee("1044","ddd","2345","SDE")]
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
  
  