import { Component } from '@angular/core';
import { Router } from '@angular/router';
import { User } from 'src/app/model/user.model';
import { UserService } from 'src/app/service/user.service';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent {

  user = new User('', '', '', '');

  constructor(private userService: UserService, private router: Router) {}


  doRegister() {
    this.userService.registerUser(this.user).subscribe({
      next: (response) => {
        console.log(response); // Log the response if needed
        this.router.navigate(['/login']);
      },
      error: (error) => {
        console.error(error); // Handle error if necessary
      },
      complete: () => {},
    });
  }

}
