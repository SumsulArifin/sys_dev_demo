import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { FormComponent } from './page/form/form.component';
import { NavbarComponent } from './page/navbar/navbar.component';

const routes: Routes = [
  // {path:'', redirectTo:'login', pathMatch:'full'},
  {path:'',component:NavbarComponent},
  {path:'login',component:FormComponent},


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
