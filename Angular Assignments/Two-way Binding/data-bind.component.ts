import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-data-bind',
  templateUrl: './data-bind.component.html',
  styleUrls: ['./data-bind.component.css']
})
export class DataBindComponent {

  orderID: String ="";
  custName: String="";
  billingDate: Date
  shippingDate: Date
  orderTotal: String ="";
  clicked : boolean = false;

 
  constructor() { }
  
  onClick(){
    this.clicked = true;
  }


 

}
