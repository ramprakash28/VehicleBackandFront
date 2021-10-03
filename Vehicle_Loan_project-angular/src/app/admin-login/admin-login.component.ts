import { Component, OnInit } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router } from '@angular/router';
import { Subscriber } from 'rxjs';
import { AdminLoginService } from '../admin-login.service';
import { Adminlogin } from '../adminlogin';

@Component({
  selector: 'app-admin-login',
  templateUrl: './admin-login.component.html',
  styleUrls: ['./admin-login.component.css']
})
export class AdminLoginComponent implements OnInit {

  constructor(private adminService:AdminLoginService ,private router:Router ) { }
  admin=new Adminlogin();
  ngOnInit(): void {
  }

  loginAdmin(adminLoginForm:any)
  {
    this.admin=adminLoginForm.value;

    this.adminService.loginAdminFromRemote(this.admin).subscribe(


      (data)=>{
        console.log(data);
       // if(data)
         // alert("Vehicle Added!");
         this.router.navigate(["/admin-dashboard"])

      },
      (error)=>{
          console.log(error);
          alert("Invalid EmailId or password!");
      }

    )
  }

}
