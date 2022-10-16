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
  

  constructor(private http : HttpClient) { 

    this. addAtnURL = "http://localhost:8082/api/attendance";
    this. getAtnURL = "http://localhost:8082/api/attendance/";
    this. updateAtnUrl = "http://localhost:8082/api/attendance/";
    this. deleteAtnUrl="http://localhost:8082/api/attendance";

  }

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
