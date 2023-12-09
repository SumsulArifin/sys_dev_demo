import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Router } from '@angular/router';
import { CheckList } from 'src/app/model/formModel';
import { dataModel } from 'src/app/model/updateModel';
import { FormService } from 'src/app/service/api.service';
import { DataService } from 'src/app/service/data.service';


@Component({
  selector: 'app-form',
  templateUrl: './form.component.html',
  styleUrls: ['./form.component.css']
})
export class FormComponent implements OnInit {
  list !: dataModel[];

  dataList: CheckList[] = [];

  form2 !: FormGroup;
  authorized: boolean = false;

  constructor(public services: FormService, private router: Router,private servicesD: DataService) {
    // this.authorized = this.authService.isAuthorized('STUDENT');
   }

  ngOnInit(): void {
    this.servicesD.getList().subscribe((newPost: dataModel[]) => {
      this.list = newPost; console.log(this.list) })
    

    this.form2 = new FormGroup({
      details: new FormControl(),
      remark: new FormControl(),


    })

  }

  addDataToList() {
    this.dataList.push(this.form2.value);
    console.log(this.dataList);
  }


  onSubmit() {
    this.services.saveMultipleData(this.dataList)
      .subscribe(
        (response) => {
          console.log('Data saved successfully:', response);
          // Handle success (e.g., show a success message)
          window.location.reload();
        },
        (error) => {
          console.error('Error saving data:', error);
          // Handle error (e.g., show an error message)
        }
      );
  }
  deletePresc(id: number) {

    if(confirm("Are you sure you want to delete record?"))
    this.servicesD.deleteList(id).subscribe(res => {
       this.list = this.list.filter(item => item.sl !== id);
       this.servicesD.getList().subscribe((newPost: dataModel[]) => {this.list = newPost;});
    
    })
    alert("Record deleted successfully");
  }
}
