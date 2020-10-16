import { Component, OnInit } from '@angular/core';
import { Modules } from './Module1';

@Component({
  selector: 'app-emp-data',
  templateUrl: './emp-data.component.html',
  styleUrls: ['./emp-data.component.css']
})
export class EmpDataComponent implements OnInit {
  emp;
  emplist;
  c;
  info=new Modules();
  getEmp(){
    this.emp=true;
    this.emplist=false;
    return this.info.details;
  }
  getEmplist(){
    this.emplist=true;
    this.emp=false;
    return this.info.details;
  }

  clear(){
    this.emp=false;
    this.emplist=false;
    this.c=true;
  }
  constructor() { }

  ngOnInit() {
  }

}
