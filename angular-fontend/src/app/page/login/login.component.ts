import { Component } from '@angular/core';
import { NgForm } from '@angular/forms';
import { Router, Data } from '@angular/router';
import { UserService } from 'src/app/service/user.service';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent {

  constructor(
    private userService: UserService,
    private router: Router,
    
  ) {}

  ngOnInit(): void {}

  login(ngForm: NgForm) {
    this.userService.login(ngForm.value).subscribe(
      (response: Data) => {          
        this.router.navigate(['navber']);
      },
      (error) => {
        console.log(error);
      }
    );
  }

  registerUser() {
    this.router.navigate(['/register']);
  }

}