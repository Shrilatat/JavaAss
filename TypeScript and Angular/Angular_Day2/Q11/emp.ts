export class Employee{
    empNo;
    eName;
    salary;
    designation;

    constructor(empNo,eName, salary, designation){
        this.empNo = empNo;
        this.eName = eName;
        this.salary = salary;
        this.designation = designation;
    }
}

export class Employees{
    allEmployees : Employee[];

    constructor(){
        this.allEmployees = [new Employee("1","Kshitij","100","Developer"),
                            new Employee("2","Robert","200","Tester"),
                            new Employee("3","John","300","Designer"),
                            new Employee("4","Stephen","400","Architect")
                        ]
    }
}