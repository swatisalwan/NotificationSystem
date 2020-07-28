import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { AdminComponent } from './admin/admin.component';
import { EmployeePortalComponent } from './employee-portal/employee-portal.component';


const routes: Routes = [
  {path:"",redirectTo:"admin",pathMatch:"full"},
  {path:"admin",component:AdminComponent},
  {path:"employeePortal",component:EmployeePortalComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
