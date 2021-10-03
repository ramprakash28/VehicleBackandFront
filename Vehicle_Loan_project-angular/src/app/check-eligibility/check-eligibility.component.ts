import { Component, OnInit } from '@angular/core';
import { FormGroup, FormControl } from '@angular/forms';

@Component({
  selector: 'app-check-eligibility',
  templateUrl: './check-eligibility.component.html',
  styleUrls: ['./check-eligibility.component.css']
})
export class CheckEligibilityComponent implements OnInit {
  onSubmit() {
    // TODO: Use EventEmitter with form value
    console.warn(this.eligibilityForm.value);
  }

  eligibilityForm=new FormGroup({
    carMake: new FormControl(''),
    carModel: new FormControl(''),
    exShowRoomPrice: new FormControl(''),
    onRoadPrice: new FormControl(''),
    
    applicantDetails: new FormGroup({
      name: new FormControl(''),
      age: new FormControl(''),
      gender: new FormControl(''),
      typeOfEmployement: new FormControl(''),
      yearlySalary: new FormControl(''),
      existingEmi: new FormControl(''),
    
      contactDetails: new FormGroup({
        mobileNo: new FormControl(''),
        emailId: new FormControl(''),
  })
})
});

  constructor() { }

  ngOnInit(): void {
  }

}
