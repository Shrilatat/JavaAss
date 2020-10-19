import { Component, OnInit } from '@angular/core';
import { Student } from '../Student';
import { StudentHttpService } from '../student-http.service';

@Component({
  selector: 'app-students-list',
  templateUrl: './students-list.component.html',
  styleUrls: ['./students-list.component.css']
})
export class StudentsListComponent implements OnInit {

  students:Student[]=[]
  constructor(private studentHttpService:StudentHttpService) { }

  ngOnInit() {
    this.studentHttpService.getStudents().subscribe(data=>this.students=data)
  }

}
