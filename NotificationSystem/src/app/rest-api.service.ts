import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { map } from 'rxjs/operators';

@Injectable({
  providedIn: 'root'
})
export class RestApiService {

  constructor(private http:HttpClient ) { }
 

  public sendNotification(data)
  {
    
    return this.http.post("http://localhost:8980/sendNotification",data,{responseType:'text' as 'json'}).subscribe(
      res => {
        console.log(res)
 });
        
  }
  public getNotification(){
    return this.http.get("http://localhost:8980/getNotifications",{responseType:'json'}).pipe(
      map(
        userData => {
        return userData;
        })
      );

  }

  public deleteNotification(id)
  {
    return this.http.delete("http://localhost:8980/cancel/"+id);
  }

  public subscribePerson(subscriber)
  {
    return this.http.patch("http://localhost:8980/editSubscriptions",subscriber,{responseType:'text' as 'json'}).subscribe(
      res => {
        console.log(res)
      });
  }

}

