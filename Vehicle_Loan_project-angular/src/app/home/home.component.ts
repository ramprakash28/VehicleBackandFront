import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';

@Component({
  selector: 'app-home',
  templateUrl: './home.component.html',
  styleUrls: ['./home.component.css']
})
export class HomeComponent implements OnInit {

  constructor(private router:Router) { }

  ngOnInit(): void {
  }


  gotoAdminLogin()
  {
    this.router.navigate(["/admin-login"]);
  }

  gotoUserLogin()
  {
    this.router.navigate(["/userlogin"]);
  }

  gotoCal()
  {
    this.router.navigate(["/emicalc"])
  }

}
