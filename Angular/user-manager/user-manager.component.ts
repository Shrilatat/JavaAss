import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user-manage',
  templateUrl: './user-manage.component.html',
  styleUrls: ['./user-manage.component.css']
})
export class UserManageComponent implements OnInit{

  titlelabel:string="Cricket Players";
  names = ["Virat","Yuvraj","Dhoni"];
  
  addName(name){
	  this.names.push(name);
  }
  delName(name){
	  for(var i in this.names){
        if(this.names[i]==name){
			this.names.splice(parseInt(i),1);
			console.log("found"); break;
        }			
	  }
  }
  delAllNames(){
	  this.names.splice(0,this.names.length);
  }
  showEvent(event){
	  console.log(event.target.value);
  }
  hide(event){
	 event.target.style.visibility = 'hidden';
  }
  show(event){
	 event.target.style.visibility = 'visible';
  }
  constructor() { }
  
  ngOnInit() {  }

}


