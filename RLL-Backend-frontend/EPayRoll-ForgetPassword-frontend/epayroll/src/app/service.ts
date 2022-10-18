import { Injectable } from '@angular/core';
import { map } from 'rxjs';
import { HttpClient } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceService {
    constructor(private http:HttpClient) { }
    url:string="http://localhost:8082/api/user/update";
    postData(data:any){
      return this.http.post<any>(this.url+"/",data).pipe(map((res:any)=>{
        return res;
      }))

    }
    updateData(data:any){
        return this.http.put<any>(this.url+"/",data).pipe(map((res:any)=>{
          return res;
        }))
  }
  
