import { Component, OnInit } from '@angular/core';
import {Module} from './Module2'

@Component({
  selector: 'app-emp-comp',
  templateUrl: './emp-comp.component.html',
  styleUrls: ['./emp-comp.component.css']
})
export class EmpCompComponent {
  
  list:boolean=false;
  table:boolean=false;
  module =new Module;

  getTable(){
    this.table=true;
    this.list=false;
    return this.module.arrEmp;
  }

  getList(){
    this.list=true;
    this.table=false;
    return this.module.arrEmp;
  }
  
  clearData(){
    this.list=false;
    this.table=false;
  }

  constructor() { }

}
