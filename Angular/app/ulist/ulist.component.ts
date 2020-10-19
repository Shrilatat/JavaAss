import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-ulist',
  templateUrl: './ulist.component.html',
  styleUrls: ['./ulist.component.css']
})
export class UlistComponent{

  unames:string[];
  purpose:string;
  constructor() {

this.unames=["Dean","Lexa","Alice"];
this.purpose="Using ngFor Directive";
   }

 

}
