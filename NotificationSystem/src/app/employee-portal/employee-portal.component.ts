import { Component, OnInit } from '@angular/core';
import { SubscriberList } from '../SubscriberList';
import { RestApiService } from '../rest-api.service';

@Component({
  selector: 'app-employee-portal',
  templateUrl: './employee-portal.component.html',
  styleUrls: ['./employee-portal.component.css']
})
export class EmployeePortalComponent implements OnInit {

  email;event;urgent;holiday;news;policy;
  subsriber:SubscriberList;

  constructor(private service:RestApiService) { }
  ngOnInit(): void {
  }

  subscribe(){
    // console.log(this.email)
    // console.log(this.event)
    // console.log(this.urgent)
    // console.log(this.holiday)
    // console.log(this.news)
    // console.log(this.policy)
    this.subsriber= new SubscriberList (this.email,this.event,this.urgent,this.holiday,this.news,this.policy)
    this.service.subscribePerson(this.subsriber);
    console.log("Your details are stored")
  }

}
