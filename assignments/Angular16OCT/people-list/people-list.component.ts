import { Component, OnInit } from '@angular/core';
import { People,myMod } from './Module1';

@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent {


  mod=new myMod();

  getAllPeople()
  {
    return this.mod.pplArr;
  }
  constructor() { }


}
