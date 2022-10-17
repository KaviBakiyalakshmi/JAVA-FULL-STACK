import { Component, OnInit } from '@angular/core';
import {FormGroup,FormBuilder,Validators}from '@angular/forms'

@Component({
  selector: 'app-signup',
  templateUrl: './signup.component.html',
  styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {
  

  //declare formgroup variables
  signupForm:FormGroup;

  //declare boolean variable to get form submitted or not
  submitted:boolean=false;

  //inject formbuilder dependency to create form with validatord
  constructor(private builder:FormBuilder) { }

  ngOnInit(): void {
    this.signupForm=this.builder.group(
      {

        firstName:["",Validators.required],
        
        lastName:["",Validators.required],
        
        email:["",[Validators.required,Validators.email]],
        
        password:["",[Validators.required,Validators.minLength(8)]]
        
        }
        
     );
  }

  //when user will check click on submit button method will be called
  OnSubmit(){
    this.submitted=true;
    if(this.signupForm.invalid)
    return;
    else
      alert("Your details register successfully");
  }

  //To access the form control in a view to display the error
  get f(){
    return this.signupForm.controls
  }
}
