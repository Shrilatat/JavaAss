import { Component, OnInit } from '@angular/core';
import { Emp } from './Employee';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent  {

 
  // emparr:Employee1[];
  viewList:boolean=false;
  viewTable:boolean=false;
  e=new Emp();
  constructor() { 
  
  }
  getTable(){
    this.viewList=false;
    this.viewTable=true;
    return this.e.values;
  }

  getList(){
    this.viewList=true;
    this.viewTable=false;
    return this.e.values;
  }
  clearAll(){
    this.viewList=false;
    this.viewTable=false;
  }

}
