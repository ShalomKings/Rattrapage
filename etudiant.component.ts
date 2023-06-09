import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { EtudiantService } from '../etudiant.service';

@Component({
  selector: 'app-etudiant',
  templateUrl: './etudiant.component.html',
  styleUrls: ['./etudiant.component.css']
})
export class EtudiantComponent implements OnInit {
  etudiantForm:any;
  etudiants:any;

  constructor(private fb:FormBuilder, private es:EtudiantService){
    this.etudiantForm=this.fb.group({
      id:[],
      nom:[],
      prenom:[],
      matricule:[],
      classe:[],
    });

  }

  ngOnInit(): void {
    this.es.getAllEtudiant().subscribe((data)=>{
      this.etudiants=data;
      console.log(this.etudiants);
    })
  }
  fnDeleteEtudiant(){
    var id=this.etudiantForm.controls.id.value;
    this.es.deleteEtudiant(id).subscribe((data)=>console.log(data)
    );

}
}
