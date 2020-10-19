class Employee{
    empno;
    ename;
    esalary;
    edesig;
    
    

    constructor(empno,ename,esalary,edesig){

        this.empno=empno;
        this.ename=ename;
        this.esalary=esalary;
        this.edesig=edesig;
    }
}

export class Company{

    ourEmployees:Employee[];
    constructor(){
        this.ourEmployees = [new Employee("T12","Aparna",100,"Fresher"),
        new Employee("T13","Ashutosh",100,"Fresher"),
        new Employee("T14","Shivani",100,"Fresher"),
        new Employee("T15","Dean",100,"Fresher")];
    }
}