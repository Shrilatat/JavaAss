import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Student } from './Student';

@Injectable({
  providedIn: 'root'
})
export class StudentHttpService {

  baseUrl='/assets/data/stud.json';

  constructor(private http:HttpClient) { }

  getStudents():Observable<Student[]>{
    return this.http.get<Student[]>(this.baseUrl)
  }
}
