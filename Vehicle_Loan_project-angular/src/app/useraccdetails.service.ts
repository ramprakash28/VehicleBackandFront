import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Observable } from 'rxjs';
import { UserAccDetails } from './user-acc-details';

@Injectable({
  providedIn: 'root'
})
export class UseraccdetailsService {

  constructor(private http : HttpClient) {
   }

   getAll(accNo:any): Observable<UserAccDetails> {
    return this.http.post<UserAccDetails>("http://localhost:8089/userAccDetails", accNo);
  }



  //  public getUserAccDetails(accNo:UserAccDetails)
  //  {
  //    return this.http.post("http://localhost:8089/userAccDetails/{AccNo}"+"UserAccDetails",accNo);
  //  }

  
}
