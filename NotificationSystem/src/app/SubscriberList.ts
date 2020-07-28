export class SubscriberList{

    email:String
    event:string 
    urgent:string
    holiday:string
    news:string
    policy:string

    constructor(email:string,event:string,urgent:string,holiday:string,news:string,policy:string){
        this.email = email;
        this.event =event;
        this.urgent = urgent;
        this.holiday =holiday;
        this.news = news;
        this.policy =policy;
      }

}