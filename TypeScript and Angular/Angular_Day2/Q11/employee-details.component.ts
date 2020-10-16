import { Component, OnInit } from '@angular/core';
import { Employees } from './emp';
 
@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent {
  employees = new Employees();

  showTable : boolean = false;
  showList : boolean = false;

  displayTable(){
    this.showList = false;
    this.showTable = true;
    return this.employees.allEmployees;
  }

  displayList(){
    this.showTable = false;
    this.showList = true;
    return this.employees.allEmployees;
  }

  clearAll(){
    this.showList = false;
    this.showTable = false;
  }
}
