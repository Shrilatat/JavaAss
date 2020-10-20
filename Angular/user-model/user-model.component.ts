import { Component, OnInit } from '@angular/core';
import { model } from './model';

@Component({
  selector: 'app-user-model',
  templateUrl: './user-model.component.html',
  styleUrls: ['./user-model.component.css']
})
export class UserModelComponent {

  model = new model();
  contact;
  getName()
  {
    return this.model.user;
  }

  getToDoItems()
  {
    this.model.items;
  }

  constructor() {
this.contact = this.model.contact;

   }

  
}
