import { Component, OnInit } from '@angular/core';
//import { FormGroup, FormControl } from '@angular/forms';
import { Router } from '@angular/router';
import { UseraccdetailsService } from '../useraccdetails.service';
import { UserAccDetails } from '../user-acc-details';

@Component({
  selector: 'app-useraccdetails',
  templateUrl: './useraccdetails.component.html',
  styleUrls: ['./useraccdetails.component.css']
})
export class UseraccdetailsComponent implements OnInit {
  constructor(private service:UseraccdetailsService, private router:Router) { }
  ngOnInit(): void {
  }

  useraccdetails(UserAccountDetailsForm:any)
  {
    this.service.getAll(UserAccountDetailsForm.value).subscribe(
      (data: UserAccDetails)=>{
        console.log(data);
        // if(data.accNo){
        //   this.router.navigate(["/homeafterlogin"])
        // }
      }
    )
  }

 gotoCheckEligibility(){
  //  (data: UserAccDetails)=>{
  //  if(data.accNo)
   this.router.navigate(["/check-eligibility"]);
 }
}
