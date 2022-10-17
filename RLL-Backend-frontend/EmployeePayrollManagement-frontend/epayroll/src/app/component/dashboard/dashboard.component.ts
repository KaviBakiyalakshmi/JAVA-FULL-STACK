import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, FormControl } from '@angular/forms'
import { Router } from '@angular/router';
import { Attendance } from 'src/app/model/attendance';
import { AttendanceService } from 'src/app/service/attendance.service';

@Component({
  selector: 'app-dashboard',
  templateUrl: './dashboard.component.html',
  styleUrls: ['./dashboard.component.css']
})


export class DashboardComponent implements OnInit {

  atnDetail !: FormGroup;
  atnObj : Attendance =new Attendance();
  atnList : Attendance[] = [];

  constructor(private formBuilder : FormBuilder, private atnService : AttendanceService, private Router : Router) { }



  ngOnInit(): void {
    
    this.getAllAttendance();
    this.atnDetail = this.formBuilder.group({ 
      id : [''],
      employeeid : [''],
      name : [''],
      starttime: [''],
      endtime: [''],
      date: [''],
      status : [''],
    });  

  }
  
  addAttendance(){

    console.log("addAttendance ----------------------->",JSON.stringify(this.atnService));
    this.atnObj.id = this.atnDetail.value.id;
    this.atnObj.employeeid = this.atnDetail.value.employeeid;
    this.atnObj.name = this.atnDetail.value.name;
    this.atnObj.starttime = this.atnDetail.value.starttime;
    this.atnObj.endtime = this.atnDetail.value.endtime;
    this.atnObj.date = this.atnDetail.value.date;
    this.atnObj.status = this.atnDetail.value.status;



    this.atnService.addAttendance(this.atnObj).subscribe(res=>{
      console.log(res);
      this.getAllAttendance();
  },err=>{
      console.log(err);
  });

}
getAllAttendance() {
  this.atnService.getAllAttendance().subscribe(res=>{
      this.atnList = res;
  },err=>{
    console.log("error while fetching data.")
  });
}
editAttendance(atn : Attendance) {
  this.atnDetail.controls['id'].setValue(atn.id);
  this.atnDetail.controls['employeeid'].setValue(atn.employeeid);
  this.atnDetail.controls['name'].setValue(atn.name);
  this.atnDetail.controls['starttime'].setValue(atn.starttime);
  this.atnDetail.controls['endtime'].setValue(atn.endtime);
  this.atnDetail.controls['date'].setValue(atn.date);
  this.atnDetail.controls['status'].setValue(atn.status);

  
}

close(){
  this.getAllAttendance();
 // this.Router.navigate("http://localhost:4200/");
}

updateAttendance() {

  this.atnObj.id = this.atnDetail.value.id;
  this.atnObj.employeeid = this.atnDetail.value.employeeid;
  this.atnObj.name = this.atnDetail.value.name;
  this.atnObj.starttime = this.atnDetail.value.starttime;
  this.atnObj.endtime = this.atnDetail.value.endtime;
  this.atnObj.date = this.atnDetail.value.date;
  this.atnObj.status = this.atnDetail.value.status;

  this.atnService.updateAttendance(this.atnObj).subscribe(res=>{
    console.log(res);
    this.getAllAttendance();
  },err=>{
    console.log(err);
  })


}

deleteAttendance(atn : Attendance) {

  this.atnService.deleteAttendance(atn).subscribe(res=>{
    console.log(res);
    alert('Attendance deleted successfully');
    this.getAllAttendance();
  },err => {
    console.log(err);
  });

}
}
 

  





  
      




