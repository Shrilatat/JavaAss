import { Component, OnInit } from '@angular/core';
import Model from "./model";
import People from "./model";


@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent {
  people:any[]=[
    {"name":"Dia","age":20,"gender":"F"}
     {"name":"Ria","age":21,"gender":"F"}
      {"name":"Raj","age":22,"gender":"M"}
  ];

  model= new Model();
  newPeople = this.getPeople();

  getPeople()
  {
    return this.model.newPeople;
  }
 

  constructor() { 
  }

  

}
