import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { User } from '../iUser';
import { LoginService } from '../login.service';

@Component({
  selector: 'app-login-comp',
  templateUrl: './login-comp.component.html',
  styleUrls: ['./login-comp.component.css']
})
export class LoginCompComponent implements OnInit {

  user: User;
  success: boolean;
  fail: boolean;
  constructor(private login: LoginService) { }

  validate(Loginform:NgForm){
    this.user=Loginform.value;
    if(this.login.getUserId(this.user.id) && this.login.getUserPassword(this.user.password)){
      this.success=true;
      this.fail=false;
    }
    else
    {
      this.fail=true;
      this.success=false;
    }

  }

  ngOnInit() {
  }

}
