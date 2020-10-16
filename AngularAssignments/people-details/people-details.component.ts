import { Component, OnInit } from '@angular/core';
import { Module } from './module';

@Component({
  selector: 'app-people-details',
  templateUrl: './people-details.component.html',
  styleUrls: ['./people-details.component.css']
})
export class PeopleDetailsComponent{

  people:any[]=[
    {"name":"Amisha","age":"23","gender":"Female"},
    {"name":"Aditi","age":"22","gender":"Female"},
    {"name":"Mauli","age":"21","gender":"Female"},
  ]

  model=new Module;
  
  constructor() { }

  getAllPeople(){
    return this.model.items;
  }

}
