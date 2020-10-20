import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BankHttpService } from '../bank-http.service';
import { Customer } from '../Customer';

@Component({
  selector: 'app-add-customer',
  templateUrl: './add-customer.component.html',
  styleUrls: ['./add-customer.component.css']
})
export class AddCustomerComponent implements OnInit {
  customer:Customer
  constructor(private bankService:BankHttpService) { }

  ngOnInit() {
  }

  createCustomer(createCustomerForm:NgForm){
    this.customer=createCustomerForm.value;
    this.bankService.postCustomer(this.customer).subscribe(data => this.customer=data);
  }

}
