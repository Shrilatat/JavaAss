import { Component, OnInit } from '@angular/core';
import { Module1 } from './Module1';

@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent {

  peoples1:any[];
  peoples2:any[];
  constructor() { 


    this.peoples1 = [
      {"name":"Dean","age":30,"gender":"male"},
      {"name":"Octavia","age":25,"gender":"female"},
      {"name":"Clark","age":29,"gender":"female"}
    ];
  }


  modl1 = new Module1();

  getAllPeople(){
    this.peoples2 = this.modl1.people_arr;
  }
}
