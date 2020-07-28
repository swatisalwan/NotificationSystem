import { Component, OnInit } from '@angular/core';
import { RestApiService } from '../rest-api.service';
import { Data } from '../Data';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.css']
})
export class AdminComponent implements OnInit {

  type:string;
  message:string;
  data
  notificationList:Data[]= [];

  constructor(private service:RestApiService) { }

  ngOnInit(): void {

  }
    
  sendType(){

    this.data= new Data(this.type,this.message)
    this.service.sendNotification(this.data);
    
  }
  showNotification(){
    
    let resp=this.service.getNotification();
    resp.subscribe(Items => {
      const length = Object.keys
      (Items).length; 
      for(var i=0;i<length;i++){
           this.notificationList[i]=Items[i];
      };

})

}

clearNotification(id){

  let resp=this.service.deleteNotification(id);
  resp.subscribe(Items => {
    const length = Object.keys
    (Items).length; 
    for(var i=0;i<length;i++){
         this.notificationList[i]=Items[i];
    };

})
}

}
