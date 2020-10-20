import { Component, OnInit } from '@angular/core';
import { Course } from '../Course';
import { CourseHttpService } from '../course-http.service';

@Component({
  selector: 'app-course-list',
  templateUrl: './course-list.component.html',
  styleUrls: ['./course-list.component.css']
})
export class CourseListComponent implements OnInit {
  courses:Course[]=[]
  constructor(private courseHttpService:CourseHttpService) { }

  ngOnInit() {
    this.courseHttpService.getCourses().subscribe(data=>this.courses=data)
  }
}
