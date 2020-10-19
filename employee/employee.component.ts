import { Component, OnInit } from '@angular/core';
import {Emp} from './empmodel'

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  emp;
  constructor() {
    this.emp=[new Emp(1,"aa",12000,"manager"),
              new Emp(2,"bb",13000,"sse"),
              new Emp(3,"cc",15000,"tse"),
              new Emp(4,"dd",17000,"sse")];
   }
   tableDisplay(event){
    document.getElementById("table1").style.visibility='visible'
    document.getElementById("list1").style.visibility='hidden'
  }
  listDisplay(event){
    document.getElementById("list1").style.visibility='visible'
    document.getElementById("table1").style.visibility='hidden'

  }

  clearDisplay(event){
    document.getElementById("list1").style.visibility='hidden'
    document.getElementById("table1").style.visibility='hidden'
  }
  ngOnInit() {
  }

}
