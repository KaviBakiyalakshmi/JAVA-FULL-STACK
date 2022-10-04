import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-binding',
  templateUrl: './binding.component.html',
  styleUrls: ['./binding.component.css']
})
export class BindingComponent implements OnInit {

  constructor() { }

  ngOnInit(): void {
  }

  products=[{name:"pencil",price:"8.9",available:"16-09-2022",ratings:4.9},
            {name:"pen",price:"10",available:"17-09-2022",ratings:5.0},
            {name:"Eraser",price:"9.0",available:"19.09.2022",ratings:4.3},
            {name:"Scale",price:"8.2",available:"30-09-2022",ratings:4.8},    
           ];

 name:string="kavi";
 url:string="http://www.google.com";
 we:number=700;

 flag=false;
  show(){
    this.flag=!this.flag;
  }
}
