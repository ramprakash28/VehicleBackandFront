import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserLoginService } from '../user-login.service';
import { Userlogin } from '../userlogin';
import { UserloginComponent } from '../userlogin/userlogin.component';

@Component({
  selector: 'app-user-register',
  templateUrl: './user-register.component.html',
  styleUrls: ['./user-register.component.css']
})
export class UserRegisterComponent implements OnInit {

  constructor(private service:UserLoginService, private router:Router) { }

  ngOnInit(): void {
  }

  user=new Userlogin();

  registerUser(userRegisterForm:any)
  {
    this.user=userRegisterForm.value;
    this.service.registerUserFromLogin(this.user).subscribe
    (
      (data)=>{
        console.log(data);
        if(data)
          alert("Registered succefully!");
          this.router.navigate(["/userlogin"]);

      },
      (error)=>{
          console.log(error);
          alert("EmailId already exists!");
      }
    )

  }
}
