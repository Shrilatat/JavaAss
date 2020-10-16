import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-two-way-binding',
  templateUrl: './two-way-binding.component.html',
  styleUrls: ['./two-way-binding.component.css']
})
export class TwoWayBindingComponent {
  orderId:string="";
  customerName:string="";
  billDate:Date
  shipDate:Date;
  total:string="";

  isClicked:boolean=false;
 

  onClick(){
    this.isClicked=true;
  }