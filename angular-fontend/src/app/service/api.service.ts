import { HttpHeaders, HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { CheckList } from '../model/formModel';
import { Observable } from 'rxjs';
import { AssignMaster } from '../model/assign-master.model';
import { AssignDetails } from '../model/assign-details.model';



const httpOptions = {
  headers: new HttpHeaders({
    'Content-Type': 'application/json'
  })
}

@Injectable({
  providedIn: 'root'
})
export class FormService {
  private apiUrl = 'http://localhost:8080/api/multipleCheckList';
  private uri='http://localhost:8080/a_m/a_m_save';
  private uriDep='http://localhost:8080/department/getAllDepartment';
  private checkLUri='http://localhost:8080/api/getAllCheckList';
  private uriDe='http://localhost:8080/a_d/a_d_save';
  private uriVi='http://localhost:8080/a_d/checklists/{a_M_Id}';
  constructor(private http: HttpClient) { }
  saveMultipleData(dataList: CheckList[]): Observable<any> {
    return this.http.post(this.apiUrl, dataList, { responseType: 'text' });
  }



  saveAssignMaster(assignMaster: AssignMaster): Observable<AssignMaster> {
    return this.http.post<AssignMaster>(this.uri, assignMaster);
  }

  getDepartments(): Observable<any[]> {
    return this.http.get<any[]>(this.uriDep);
  }
  
  getCheackList(): Observable<any[]> {
    return this.http.get<any[]>(this.checkLUri);
  }

  saveAssignDetails(assignDetails: AssignDetails): Observable<any> {
    return this.http.post<any>(this.uriDe, assignDetails);
  }

  getCheckListsByAMId(a_M_Id: number): Observable<AssignDetails[]> {

    return this.http.get<AssignDetails[]>(this.uriVi);
  }

  
}

