import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { StudentsListComponent } from './students-list/students-list.component';
import { CourseListComponent } from './course-list/course-list.component';
import { StudentHttpService } from './student-http.service';
import { CourseHttpService } from './course-http.service';

@NgModule({
  declarations: [
    AppComponent,
    StudentsListComponent,
    CourseListComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule
  ],
  providers: [StudentHttpService,CourseHttpService],
  bootstrap: [AppComponent]
})
export class AppModule { }
