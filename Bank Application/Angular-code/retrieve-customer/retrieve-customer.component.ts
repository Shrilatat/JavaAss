import { Component, OnInit } from "@angular/core";
import { NgForm } from "@angular/forms";
import { BankService } from "../bank.service";
import { Customer } from "../Customer";
import { CustomerAccount } from "../CustomerAccount";

@Component({
  selector: "app-retrieve-customer",
  templateUrl: "./retrieve-customer.component.html",
  styleUrls: ["./retrieve-customer.component.css"]
})
export class RetrieveCustomerComponent implements OnInit {
  Id: number;
  customerAccount: CustomerAccount;
  constructor(private bankService: BankService) {}

  ngOnInit() {}

  getCustomer(form: NgForm) {
    console.log(form.value);
    this.bankService
      .getCustomer(form.value.Id)
      .subscribe(data => (this.customerAccount = data));
  }
}
