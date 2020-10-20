import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import {Customer} from './Customer';
import {CustomerDetail} from './CustomerDetails';

@Injectable({
  providedIn: 'root'
})
export class BankHttpService {
  accountsBaseUrl:string = "http:localhost:8082/accounts";
  customerBaseUrl:string = "http:localhost:8080/customer"
  constructor(private http:HttpClient) { }

  getcustomerDetails(customerId:number):Observable<CustomerDetail>{
    return this.http.get<CustomerDetail>(this.accountsBaseUrl+customerId);
  }
  
  postCustomer(customer:Customer):Observable<Customer>{
    return this.http.post<Customer>(this.customerBaseUrl,customer);
  }
}
