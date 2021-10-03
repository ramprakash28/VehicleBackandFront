import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { UserLoginService } from '../user-login.service';
import { Userlogin } from '../userlogin';

@Component({
  selector: 'app-userlogin',
  templateUrl: './userlogin.component.html',
  styleUrls: ['./userlogin.component.css']
})
export class UserloginComponent implements OnInit {

  constructor(private service:UserLoginService, private router:Router)  { }

  ngOnInit(): void {
  }
  user=new Userlogin();

  loginuser(userLoginForm:any)
  {
    this.user=userLoginForm.value;

    this.service.loginUserFromRemote(this.user).subscribe(

      (data)=>{
        console.log(data);
        this.router.navigate(["/homeafterlogin"])
        // if(data)
        //   alert("Vehicle Added!");
      },
      (error)=>{
          console.log(error);
          alert("Invalid EmailId or password!");
      }

    )

    }


    gotoRegisterUser():void
    {
     // alert("hi");
     this.router.navigate(["/user-register"]);

    }


}
