import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-prop-bind',
  templateUrl: './prop-bind.component.html',
  styleUrls: ['./prop-bind.component.css']
})
export class PropBindComponent implements OnInit {

  constructor() {
    this.btnlabel="Login";
    this.myimage="C:\Users\nEW u\Pictures\Wallpapers";

   }

  ngOnInit() {
  }

}
