export class Module {
    items
    constructor() {
      this.items = [new employee("101","Amisha","50000","HR"),
      new employee("102","Aditi","40000","MR"),
      new employee("103","Mauli","30000","SE"),
      new employee("104","Fareeya","20000","WD")]
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