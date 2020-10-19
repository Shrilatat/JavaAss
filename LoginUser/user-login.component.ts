import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../LoginUser';

@Component({
  selector: 'app-user-login',
  templateUrl: './user-login.component.html',
  styleUrls: ['./user-login.component.css']
})
export class UserLoginComponent implements OnInit {
  user:User={uname:"Smriti",password:"123"};
  user1:User;
  constructor() { }

  ngOnInit() {
  }
  onsubmit(ngform:NgForm){
    this.user1=ngform.value;
    if(this.user1.uname==this.user.uname && this.user1.password==this.user.password)
      console.log("Login Authenticated");
    else console.log("Wrong Credentials")
  }

}
