import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { BankHttpService } from '../bank-http.service';
import {CustomerDetail} from '../CustomerDetails';

@Component({
  selector: 'app-view-customer',
  templateUrl: './view-customer.component.html',
  styleUrls: ['./view-customer.component.css']
})
export class ViewCustomerComponent implements OnInit {

  customeId:number
  customerDetails:CustomerDetail
  constructor(private bankService:BankHttpService) { }

  ngOnInit() {
  }

  getCustomer(customerForm:NgForm){
    console.log(customerForm.value);
    this.bankService.getcustomerDetails(customerForm.value.customerId).subscribe(data => this.customerDetails=data);
  }

}
