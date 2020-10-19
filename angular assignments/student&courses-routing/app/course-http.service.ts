import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Course } from './Course';

@Injectable({
  providedIn: 'root'
})
export class CourseHttpService {

  baseUrl = 'http://localhost:8098/MyApp/courses';

  constructor(private http: HttpClient) { }

  getCourses(): Observable<Course[]> {
    return this.http.get<Course[]>(this.baseUrl)
  }
}
