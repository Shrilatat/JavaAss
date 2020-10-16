import { Component, OnInit } from '@angular/core';
import { employee } from "./employee"

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {


  employees: employee[] = [
    new employee(1, "bharat", 91111, "tse"),
    new employee(2, "bhavya", 81111, "tse"),
    new employee(3, "aditi", 71111, "tse"),
    new employee(4, "mauli", 61111, "tse"),
  ]
  
  display: string;

  wayOfDisplay(type: string):void {
    this.display = type
  }
  // tableDisplay(event){
  //   this.display='table'
  // }

  // listDisplay(event){
  //   this.display='list'

  // }

  // clearDisplay(event){
  //   this.display=''
  // }

  constructor() { }

  ngOnInit() {
  }

}

