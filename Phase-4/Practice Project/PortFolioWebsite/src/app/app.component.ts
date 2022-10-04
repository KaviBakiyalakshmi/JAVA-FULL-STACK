import { Component } from '@angular/core';
import { RouterModule,Routes } from '@angular/router';
import { SigninComponent } from './signin/signin.component';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'portfolioWebsite';
}
