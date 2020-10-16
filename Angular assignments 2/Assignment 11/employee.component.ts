import { Component, OnInit } from '@angular/core';
import { Module } from './model';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent  {
  listcheck:boolean=false;
  tablecheck:boolean=false;
  model=new Module;
  constructor() { }

  getEmpTable(){
    this.tablecheck=true;
    this.listcheck=false;
    return this.model.items;
  }

  getEmpList(){
    this.listcheck=true;
    this.tablecheck=false;
    return this.model.items;
  }

  clearAll(){
    this.listcheck=false;
    this.tablecheck=false;
  }

  

}
