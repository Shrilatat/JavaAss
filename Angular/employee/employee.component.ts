import { Component, OnInit } from '@angular/core';
import {Module} from './Employee';
@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent  {
  list:boolean=false;
  table:boolean=false;
  model=new Module;
  constructor() { }

  getTable(){
    this.table=true;
    this.list=false;
    return this.model.items;
  }

  getList(){
    this.list=true;
    this.table=false;
    return this.model.items;
  }
  
  clearData(){
    this.list=false;
    this.table=false;
  }

}
