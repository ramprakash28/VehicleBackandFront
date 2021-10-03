import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-homeafterlogin',
  templateUrl: './homeafterlogin.component.html',
  styleUrls: ['./homeafterlogin.component.css']
})
export class HomeafterloginComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }

  gotoaddUserAccDetails(){
    this.router.navigate(["/useraccdetails"]);
  }

  gotoUserDashboard()
  {
    this.router.navigate(["/user-dashboard"]);
  }

  gotoHome()
  {
    this.router.navigate(["/home"])
  }

}
