import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order-details',
  templateUrl: './order-details.component.html',
  styleUrls: ['./order-details.component.css']
})
export class OrderDetailsComponent{
  orderId;
  custName;
  billingDate;
  shippingDate;
  orderTotal;
  display = false;

  displayDetails(){
    this.display=true;
  }
}
