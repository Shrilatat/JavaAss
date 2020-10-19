import { Component } from '@angular/core';
import {Module} from './model1';
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent {
  people:any[]=[
    {"name":"ria","age":"23","gender":"female"},
    {"name":"dia","age":"27","gender":"female"},
    {"name":"anish","age":"20","gender":"male"},
  ]

  model=new Module;
  
  constructor() { }

  getAllPeople(){
    return this.model.items;
  }
}
