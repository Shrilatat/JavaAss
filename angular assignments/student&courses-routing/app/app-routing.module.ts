import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { CourseListComponent } from './course-list/course-list.component';
import { StudentsListComponent } from './students-list/students-list.component';

const routes: Routes = [
  {path:'students',component:StudentsListComponent},
  {path:'courses', component:CourseListComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
