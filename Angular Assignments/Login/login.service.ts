import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class LoginService {

  
  constructor() {}
  user=[ {id:1,pass:"aaa"},
          {id:2,pass:"bbb"},
          {id:3,pass:"ccc"}];

  getUserId(id){
    for(let i of this.user){
      if(i.id == id)
      return true;
      else
      return false;
    }
  }
  getUserPassword(pass){
    for(let p of this.user){
      if(p.pass == pass)
      return true;
      else
      return false;
    }
  }
           
}
