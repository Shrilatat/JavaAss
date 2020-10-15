import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-about-us',
  templateUrl: './about-us.component.html',
  styleUrls: ['./about-us.component.css']
})
export class AboutUsComponent implements OnInit {
  myData : string
  constructor() { 
    this.myData = "This text is to be displayed in about-us component"
  }

  ngOnInit() {
  }

}
