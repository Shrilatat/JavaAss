import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-order',
  templateUrl: './order.component.html',
  styleUrls: ['./order.component.css']
})
export class OrderComponent implements OnInit {
  id:number;
  custName:string;
  bDate:string;
  sDate:string;
  total:number;
  
  setDisplayValues(a,b,c,d,e){
    this.id=a;
    this.custName=b
    this.bDate=c
    this.sDate=d
    this.total=e
  }


  constructor() { }

  ngOnInit() {
  }

}
