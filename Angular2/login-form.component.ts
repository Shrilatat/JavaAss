import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../loginForm';

@Component({
  selector: 'app-login-form',
  templateUrl: './login-form.component.html',
  styleUrls: ['./login-form.component.css']
})
export class LoginFormComponent implements OnInit {

  user1:User={uname:"rita" , password:"abcde"};
  user1:User;
  constructor() { }

  ngOnInit() {
  }

  onsubmit(ngForm:NgForm)
  {
    this.user2=ngform.value;
    if(this.user2.uname=this.user1.uname && this.user2.password=this.user1.password)
    {
      console.log("validated user");
    }
    else
    {
      console.log("invalid user");
    }

  }

}
