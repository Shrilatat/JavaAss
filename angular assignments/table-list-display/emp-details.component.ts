import { Component, OnInit } from '@angular/core';
import {employee} from "./employee"

@Component({
  selector: 'app-emp-details',
  templateUrl: './emp-details.component.html',
  styleUrls: ['./emp-details.component.css']
})
export class EmpDetailsComponent implements OnInit {

  employees:employee[] = [
    new employee(1,"bharat",91111,"tse"),
    new employee(2,"bhavya",81111,"tse"),
    new employee(3,"aditi",71111,"tse"),
    new employee(4,"mauli",61111,"tse"),
  ]

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

  constructor() { }

  ngOnInit() {
  }

}

