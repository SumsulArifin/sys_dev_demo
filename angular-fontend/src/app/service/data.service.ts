import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { dataModel } from '../model/updateModel';



const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
}

@Injectable({
  providedIn: 'root'
})
export class DataService {

  private url = 'http://localhost:8080/api';

  constructor(private httpService: HttpClient) { }


  getList() : Observable<dataModel[]> {
    const list = this.httpService.get<dataModel[]>(this.url + '/getAllCheckList');
    return list;
  }


  deleteList(id:number) {

    return this.httpService.delete(this.url + '/deleteCheckList/'+ id)
  }
}
