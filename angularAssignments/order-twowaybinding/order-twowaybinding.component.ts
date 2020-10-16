import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order-twowaybinding',
  templateUrl: './order-twowaybinding.component.html',
  styleUrls: ['./order-twowaybinding.component.css']
})
export class OrderTwowaybindingComponent {

  orderid:number;
    custName:string;
    billDate:string;
    shippingDate:string;
    total:number;
  
    setDisplayValues(id,name,billingdate,shippingdate,total){
      this.orderid=id;
      this.custName=name;
      this.billDate=billingdate;
      this.shippingDate=shippingdate;
      this.total=total;
    }
  
  }
