 import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { Adminlogin } from './adminlogin';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class AdminLoginService {

  constructor(private http : HttpClient) { }

  public loginAdminFromRemote(admin:Adminlogin)
  {
      return this.http.post("http://localhost:8089/adminLogin",admin);
  }


}
