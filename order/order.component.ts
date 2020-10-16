import { Component, OnInit } from '@angular/core';
import { totalmem } from 'os';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {
  orderid;
  custname;
  bDate;
  sDate;
  ototal;

  constructor() { }

  ngOnInit() {
  }

}
