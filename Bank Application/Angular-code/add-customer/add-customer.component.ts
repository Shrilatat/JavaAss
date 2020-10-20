import { Component, OnInit } from "@angular/core";
import { NgForm } from "@angular/forms";
import { BankService } from "../bank.service";
import { Customer } from "../Customer";
import { CustomerAccount } from "../CustomerAccount";

@Component({
  selector: "app-add-customer",
  templateUrl: "./add-customer.component.html",
  styleUrls: ["./add-customer.component.css"]
})
export class AddCustomerComponent implements OnInit {
  customer: Customer;

  constructor(private bankService: BankService) {}

  ngOnInit() {}

  addCustomer(form: NgForm) {
    this.customer = form.value;
    this.bankService
      .addCustomer(this.customer)
      .subscribe(data => (this.customer = data));
  }
}
