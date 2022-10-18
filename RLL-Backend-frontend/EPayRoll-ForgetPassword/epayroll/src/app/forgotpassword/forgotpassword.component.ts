import { Component, OnInit } from '@angular/core';
import { FormGroup, FormBuilder, Validators}from '@angular/forms';

@Component({
  selector: 'app-forgotpassword',
  templateUrl: './forgotpassword.component.html',
  styleUrls: ['./forgotpassword.component.css']
})
export class ForgotpasswordComponent implements OnInit {

  PasswordResetForm: FormGroup;
  submitted:boolean=false;
  constructor(private builder:FormBuilder) { }

  ngOnInit(): void {
    this.PasswordResetForm=this.builder.group(
      {
      EmployeeId:["",Validators.required],
      Name:["",Validators.required],
      Email:["",Validators.required],
      NewPassword:["",Validators.required],
      ConfirmPassword:["",Validators.required]
      }
    );
  }
  OnSubmit(){
    this.submitted=true;
    if(this.PasswordResetForm.invalid)
    return;
    else
    alert("Password Reset Successfully");
  }
  get f(){
    return this.PasswordResetForm.controls;
  }

}
