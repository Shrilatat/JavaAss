import { Component, OnInit } from '@angular/core';
import {Module} from './Module1';
@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent implements OnInit {
  Module=new Module();
people:any[]=[{"name":"Sid","age":21,"gender":"male"},
              {"name":"aditya","age":22,"gender":"male"},
              {"name":"aditi","age":22,"gender":"female"},
              {"name":"Pratik","age":23,"gender":"male"} 
            ];

getAllPeople()
{
  return this.Module.people;
}
  constructor() { }

  ngOnInit() {
  }

}
