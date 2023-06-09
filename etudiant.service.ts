import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class EtudiantService {

  baseUrl='http://localhost:8080/etudiant';
  constructor(private http:HttpClient) { }
  getAllEtudiant(){
    return this.http.get(this.baseUrl);
  }
  findEtudiantByClasse(classe:any){
    return this.http.get(this.baseUrl+"/"+classe);

  }
  deleteEtudiant(id:any){
    return this.http.delete(this.baseUrl+"/"+id);
  }

}
