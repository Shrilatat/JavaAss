import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PeopleListComponent } from './people-list/people-list.component';
import { FormsModule } from '@angular/forms';
import { OrderMgmtComponent } from './order-mgmt/order-mgmt.component';
import { EmpMgmtComponent } from './emp-mgmt/emp-mgmt.component';

@NgModule({
  declarations: [
    AppComponent,
    PeopleListComponent,
    OrderMgmtComponent,
    EmpMgmtComponent,
  ],
  imports: [
    BrowserModule,
    FormsModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
