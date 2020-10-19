import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../userLogin';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {
  user:User={uname:"Pooja",password:"4567"};
  nuser:User;
  constructor() { }

  ngOnInit() {
  }
  onsubmit(ngform:NgForm){
    this.nuser=ngform.value;
    if(this.nuser.uname==this.user.uname && this.nuser.password==this.user.password)
      console.log("Login successful!");
    else console.log("Authentication failed!")
  }

}