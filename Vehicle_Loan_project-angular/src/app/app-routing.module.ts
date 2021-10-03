import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AdminDashboardComponent } from './admin-dashboard/admin-dashboard.component';
import { AdminLoginComponent } from './admin-login/admin-login.component';
import { EMICalcComponent } from './emicalc/emicalc.component';
import { HomeComponent } from './home/home.component';
import { HomeafterloginComponent } from './homeafterlogin/homeafterlogin.component';
import { UserDashboardComponent } from './user-dashboard/user-dashboard.component';
import { UserRegisterComponent } from './user-register/user-register.component';
import { UserloginComponent } from './userlogin/userlogin.component';
import { CheckEligibilityComponent } from './check-eligibility/check-eligibility.component';
import { UseraccdetailsComponent } from './useraccdetails/useraccdetails.component';

const routes: Routes = 
[
  //{path:'',component:AdminLoginComponent},
 // {path:'' , component:UserloginComponent},
 //{path:'',component:AdminLoginComponent},
{path:'',component:HomeComponent},
{path:'homeafterlogin',component:HomeafterloginComponent},
{path:'user-register',component:UserRegisterComponent},
{path:'userlogin',component:UserloginComponent},
{path:'homeafterlogin',component:HomeafterloginComponent},
{path:'admin-login',component:AdminLoginComponent},
{path:'admin-dashboard',component:AdminDashboardComponent},
{path:'home',component:HomeComponent},
{path:'user-dashboard',component:UserDashboardComponent},
{path:'emicalc',component:EMICalcComponent},
{path:'useraccdetails',component:UseraccdetailsComponent},
{path:'check-eligibility',component:CheckEligibilityComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
