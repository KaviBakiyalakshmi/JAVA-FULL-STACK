import { Injectable } from '@angular/core';
import { HttpClient, HttpClientModule } from '@angular/common/http';
import { Observable } from 'rxjs';
import { Attendance } from '../model/attendance';

@Injectable({
  providedIn: 'root'
})
export class AttendanceService {

  addAtnURL : string;
  getAtnURL : string;
  updateAtnUrl : string;
  deleteAtnUrl : string;
 // getidAtnUrl : number;
  
  
 
 
  constructor(private http : HttpClient) { 

    this. addAtnURL = "http://localhost:8082/api/attendance";
    this. getAtnURL = "http://localhost:8082/api/attendance/";
    this. updateAtnUrl = "http://localhost:8082/api/attendance/";
    this. deleteAtnUrl="http://localhost:8082/api/attendance";
   // this. getidAtnUrl="http://localhost:8082/api/attendance";
  }

  // url='http://localhost:8085/api/attendance';

  // public getAllInfo(employeeid:number):Observable<Attendance[]>{
  //   return this.http.get<Attendance[]>(`${this.url}/atn/${employeeid}`);
    
  // }
  addAttendance(atn : Attendance): Observable<Attendance> {
    return this.http.post<Attendance>(this.addAtnURL,atn);
  }

  getAllAttendance(): Observable<Attendance[]>{
    return this.http.get<Attendance[]>(this.getAtnURL);
  }

  updateAttendance(atn :Attendance) : Observable<Attendance>{
    return this.http.put<Attendance>(this.updateAtnUrl, atn);
  }

  deleteAttendance(atn : Attendance) : Observable<Attendance> {
    return this.http.delete<Attendance>(this.deleteAtnUrl+'/'+atn.id);
  }


}
