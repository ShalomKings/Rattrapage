package session.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import session.entity.Etudiant;
import session.service.EtudiantService;

import java.util.List;

@RestController
@RequestMapping("/etudiant")
@CrossOrigin(origins = {"http:localhost:4200"})
public class EtudiantController {
    @Autowired
    private EtudiantService etudiantService;
    @GetMapping
    public List<Etudiant> retrieveAllEtudiant(){
        return etudiantService.read();
    }
    @GetMapping("/id")
    public Etudiant findEtudiantById(@PathVariable("id")Long id){
        return etudiantService.read(id);
    }
    @PostMapping
    public Etudiant addEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.create(etudiant);
    }
    @PutMapping
    public Etudiant updateEtudiant(@RequestBody Etudiant etudiant){
        return etudiantService.update(etudiant);
    }
    @DeleteMapping ("/{id}")
    public Etudiant removeEtudiant(@PathVariable("id")Long id){
        return etudiantService.delete(id);
    }

}
