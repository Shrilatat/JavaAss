import { Component, OnInit } from '@angular/core';
import {Module} from './Module1';
@Component({
  selector: 'app-people-list',
  templateUrl: './people-list.component.html',
  styleUrls: ['./people-list.component.css']
})
export class PeopleListComponent{
  module = new Module();
  myCrowd;

  getAllPeople(){
    console.log(this.module.crowd);
    this.myCrowd =  this.module.crowd;
    console.log(this.myCrowd);
  }
}
