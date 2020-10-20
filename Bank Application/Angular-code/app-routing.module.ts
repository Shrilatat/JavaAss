import { NgModule } from "@angular/core";
import { Routes, RouterModule } from "@angular/router";
import { AddCustomerComponent } from "./add-customer/add-customer.component";
import { RetrieveCustomerComponent } from "./retrieve-customer/retrieve-customer.component";

const routes: Routes = [
  { path: "addCustomer", component: AddCustomerComponent },
  { path: "retrieveCustomer", component: RetrieveCustomerComponent }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule {}
