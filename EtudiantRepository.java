package session.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import session.entity.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {

}
