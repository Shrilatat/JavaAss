import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css']
})
export class OrderDetailsComponent implements OnInit {
  orderId;
  custName;
  billingDate;
  shipDate;
  total;
  
  clicked:boolean=false;
  constructor() { }

  onClick(){
    this.clicked=true;
  }

  ngOnInit() {
  }

}
