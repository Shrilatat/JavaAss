import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order-mgmt',
  templateUrl: './order-mgmt.component.html',
  styleUrls: ['./order-mgmt.component.css']
})



export class OrderMgmtComponent {
 
    id:string;
    isClicked=false;
    cust_name;bill_date;ship_date;total;

    Clicked(){
      this.isClicked=true;
    }
  constructor() { }

  

}
