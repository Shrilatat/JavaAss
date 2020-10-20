import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Console } from 'console';
import { LoginServiceService } from '../login-service.service';

@Component({
  selector: 'app-login-service',
  templateUrl: './login-service.component.html',
  styleUrls: ['./login-service.component.css']
})
export class LoginServiceComponent implements OnInit {

  constructor(private loginServiceService:LoginServiceService) { }

  ngOnInit() {
    
  }
  onsubmit(form:NgForm){
    console.log(form.value)
    if (this.loginServiceService.authenticateUser(form.value))
      console.log("Login successfull")
    else 
      console.log("Login unsucccessfull")
      
  }

}
