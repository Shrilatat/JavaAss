import { Component, OnInit } from '@angular/core';
import {Module1} from './Module1'

@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent {

  people;
  Module1 = new Module1();

  constructor() { 
    this.people= [{"name":"Pushkar","age":"23","Gender":"Male"},
                  {"name":"Shivani","age":"23","Gender":"Female"},
                  {"name":"Vapour","age":"200","Gender":"Male"}];
  }

  getPeople(){
    return this.people;
  }

  getAllPeople(){
    return this.Module1.arrPeople;

  }

 
}
