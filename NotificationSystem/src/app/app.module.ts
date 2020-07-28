import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {FormsModule} from '@angular/forms';
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { AdminComponent } from './admin/admin.component';
import { RestApiService } from './rest-api.service';
import {HttpClientModule} from '@angular/common/http';
import { EmployeePortalComponent } from './employee-portal/employee-portal.component'

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    EmployeePortalComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    FormsModule,
  ],
  providers: [RestApiService],
  bootstrap: [AppComponent]
})
export class AppModule { }
