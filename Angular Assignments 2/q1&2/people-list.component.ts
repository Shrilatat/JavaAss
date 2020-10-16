import { Component, OnInit } from '@angular/core';
import {Module} from './Module1';
@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent implements OnInit {
  //Assignment 8 people json arr
  people:any[]=[{"name":"Ria","age":23,"gender":"female"},
  {"name":"Dia","age":27,"gender":"female"},
  {"name":"Anish","age":20,"gender":"male"}];

  //Assignmnet 9 People Array
  peopleModule = new Module();

  displayAllPeople(){
    return this.peopleModule.peoples;
  }
  constructor() { }

  ngOnInit() {
  }

}
