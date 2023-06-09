package session.entity;


import jakarta.persistence.*;
import lombok.*;


@Entity
@Table(name="etudiants")
@DiscriminatorValue(value="Etudiant")
@Data
@AllArgsConstructor
@NoArgsConstructor
@Setter
@Getter
public class Etudiant{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    private String nom;
    private String prenom;
    private String matricule;
    private String classe;

}
