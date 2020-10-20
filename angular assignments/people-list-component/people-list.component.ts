import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent implements OnInit {

  people:any[] = [
    {"name":"Ria","age":23,"gender":"female"},
    {"name":"Dia","age":27,"gender":"female"},
    {"name":"Anish","age":20,"gender":"male"}
  ]

  constructor() { }

  ngOnInit() {
  }

}
