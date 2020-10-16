import { Component, OnInit } from '@angular/core';
import { Company } from './Employee';

@Component({
  selector: 'app-emp-mgmt',
  templateUrl: './emp-mgmt.component.html',
  styleUrls: ['./emp-mgmt.component.css']
})
export class EmpMgmtComponent {

  emps:any[];
  isTable=false;
  isList=false;
  company = new Company();
 constructor(){

  this.emps = this.company.ourEmployees;
 }

 onlyTable(){
   this.isTable=true;
   this.isList=false;
 }

 onlyList(){
   this.isList=true;
  this.isTable=false;
  }
 Nothing(){
   this.isTable=false;
   this.isList=false;
 }
}

