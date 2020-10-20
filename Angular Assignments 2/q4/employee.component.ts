import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-employee',
  templateUrl: './employee.component.html',
  styleUrls: ['./employee.component.css']
})
export class EmployeeComponent implements OnInit {
  employees:any[]=[{"empno":1,"empname":"W","salary":10000,"desg":"Clerk"},
  {"empno":2,"empname":"X","salary":12000,"desg":"Clerk"},
  {"empno":3,"empname":"Y","salary":30000,"desg":"Designer"},
  {"empno":4,"empname":"Z","salary":50000,"desg":"Senior Designer"}]
  bonus;
  totl;
  isShowTable:boolean=false;
  isShowList:boolean=false;
  
  displayTable(){
    this.isShowTable=!this.isShowTable;
  }

  
  displayList(){
    this.isShowList=!this.isShowList;
  }

  
  clearDisplay(){
    this.isShowTable=!this.isShowTable;
    this.isShowList=!this.isShowList;
  }

  calcBonus(x){
    for(let e of this.employees){
      if(e.empno==x){
        this.bonus=(e.salary*0.1)
      }
    }
    return this.bonus
  }

  calcTotal(x){
    for(let e of this.employees){
      if(e.empno==x){
        this.totl=e.salary+(e.salary*0.1)
      }
    }
    return this.totl
  }

  constructor() { }

  ngOnInit() {
  }

}
