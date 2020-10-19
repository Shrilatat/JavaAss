import { Injectable } from '@angular/core';
import { User } from './User';

@Injectable({
  providedIn: 'root'
})
export class LoginServiceService {

  loginId="Admin@123"
  password="secret"

  constructor() { }
  
  authenticateUser(user:User):boolean{
    return (user.loginId==this.loginId && user.password==this.password)
  }
}
