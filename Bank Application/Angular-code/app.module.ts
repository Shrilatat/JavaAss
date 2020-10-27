import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { HttpClientModule } from "@angular/common/http";
import { AppRoutingModule } from "./app-routing.module";
import { AppComponent } from "./app.component";
import { AddCustomerComponent } from "./add-customer/add-customer.component";
import { RetrieveCustomerComponent } from "./retrieve-customer/retrieve-customer.component";
import { BankService } from "./bank.service";
import { FormsModule } from "@angular/forms";

@NgModule({
  declarations: [AppComponent, AddCustomerComponent, RetrieveCustomerComponent],
  imports: [BrowserModule, FormsModule, AppRoutingModule, HttpClientModule],
  providers: [BankService],
  bootstrap: [AppComponent]
})
export class AppModule {}
