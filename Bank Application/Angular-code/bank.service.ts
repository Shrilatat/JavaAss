import { HttpClient } from "@angular/common/http";
import { Injectable } from "@angular/core";
import { Observable } from "rxjs";
import { Customer } from "./Customer";
import { CustomerAccount } from "./CustomerAccount";

@Injectable({
  providedIn: "root"
})
export class BankService {
  baseUrl = "http://localhost:8090/accounts/";
  baseUrl2 = "http://localhost:8080/customers/";

  constructor(private http: HttpClient) {}

  getCustomer(Id): Observable<CustomerAccount> {
    return this.http.get<CustomerAccount>(this.baseUrl + Id);
  }

  addCustomer(customer: Customer): Observable<Customer> {
    return this.http.post<Customer>(this.baseUrl2, customer);
  }
}
