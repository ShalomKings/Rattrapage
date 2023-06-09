package session.service;

import org.springframework.beans.factory.annotation.Autowired;
import session.entity.Etudiant;
import session.repository.EtudiantRepository;

import java.util.List;
import java.util.Optional;

public class EtudiantService {
    @Autowired
    private EtudiantRepository etudiantRepository;

    public Etudiant create(Etudiant etudiant){
        return etudiantRepository.save(etudiant);
    }
    public List<Etudiant> read(){
        return etudiantRepository.findAll();
    }
    public Etudiant read(Long id){
        Optional<Etudiant> temp=etudiantRepository.findById(id);
        Etudiant etudiant=null;
        if (temp.isPresent()) {
            etudiant = temp.get();
        }
        return etudiant;
    }
    public Etudiant update(Etudiant etudiant){
        Optional<Etudiant> temp=etudiantRepository.findById(etudiant.getId());
        if (temp.isPresent()){
            etudiantRepository.save(etudiant);
            return etudiant;
        }else{
            return null;
        }

    }
    public Etudiant delete(Long id){
        Optional<Etudiant> temp=etudiantRepository.findById(id);
        Etudiant etudiant=null;
        if (temp.isPresent()){
            etudiant=temp.get();
            etudiantRepository.delete(etudiant);
        }
        return etudiant;
    }
}
