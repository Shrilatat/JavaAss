import { Component, OnInit } from '@angular/core';
import { Module1 } from "./Module1"
@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent implements OnInit {

  module1 = new Module1()

  getAllPeople(){
    return this.module1.people
  }

  constructor() { }

  ngOnInit() {
  }

}
