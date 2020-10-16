import { Component, OnInit } from '@angular/core';
import { Module } from './module';

@Component({
  selector: 'app-employee-details',
  templateUrl: './employee-details.component.html',
  styleUrls: ['./employee-details.component.css']
})
export class EmployeeDetailsComponent {

  listcheck:boolean=false;
  tablecheck:boolean=false;
  model=new Module;
  constructor() { }

  getTable(){
    this.tablecheck=true;
    this.listcheck=false;
    return this.model.items;
  }

  getList(){
    this.listcheck=true;
    this.tablecheck=false;
    return this.model.items;
  }
  
  clearData(){
    this.listcheck=false;
    this.tablecheck=false;
  }

}
