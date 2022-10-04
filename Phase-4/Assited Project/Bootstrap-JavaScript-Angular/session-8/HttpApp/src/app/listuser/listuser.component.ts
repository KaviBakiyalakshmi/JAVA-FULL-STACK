import { Component, OnInit } from '@angular/core';
import { DataService } from '../data.service';
import { UserClass } from '../UserClass';

@Component({
  selector: 'app-listuser',
  templateUrl: './listuser.component.html',
  styleUrls: ['./listuser.component.css']
})
export class ListuserComponent implements OnInit {

  constructor(private service:DataService) { }

  user:UserClass[];
  ngOnInit(): void {

    this.service.getAllUsers().subscribe(result=>this.user=result);
  }

}
