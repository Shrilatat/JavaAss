import { Component, OnInit } from '@angular/core';
import {Module} from './model1'

@Component({
  selector: 'app-empdata',
  templateUrl: './empdata.component.html',
  styleUrls: ['./empdata.component.css']
})
export class EmpDataComponent {

  listcheck:boolean=false;
  tablecheck:boolean=false;
  model=new Module;
  constructor() { }

  getTable(){
    this.tablecheck=true;
    this.listcheck=false;
    return this.model.items;
  }

  getList(){
    this.listcheck=true;
    this.tablecheck=false;
    return this.model.items;
  }
  
  clearData(){
    this.listcheck=false;
    this.tablecheck=false;
  }

}
