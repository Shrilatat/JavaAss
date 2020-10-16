import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css']
})
export class OrderDetailsComponent {

  orderid:string="";
  customername:string="";
  billdate:Date
  shipdate:Date;
  ordertotal:string="";

  clicked:boolean=false;
  constructor() { }

  onClick(){
    this.clicked=true;
  }

}
