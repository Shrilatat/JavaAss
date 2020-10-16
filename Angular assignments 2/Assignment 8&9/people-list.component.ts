import { Component, OnInit } from '@angular/core';
import { Module1 } from './MOdule1';

@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent {
  peoplelist:any[]
  peopleL:any[]
  constructor() {
    this.peoplelist=[
      {
        "name": "Pooja",
        "age": "21",
        "gender": "Female"
        },
        {
            "name": "Siya",
            "age": "23",
            "gender": "Female"
         },
        {
            "name": "sid",
            "age": "20",
            "gender": "Male"
        }
    ];
   }

  module = new Module1();

  getAllPeople(){
    this.peopleL = this.module.peopleArr;
  }
  
  ngOnInit() {
  }

}
