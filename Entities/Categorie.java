package tn.esprit.testspring_malek.Entities;


import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity
@Table(name = "Categorie")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)



public class Categorie {

    @Id
    @Column(name = "identifiant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idCategorie;


    @Column(nullable = false)
    String codeCategorie;

    @Column(nullable = false)
    String nomCategorie;

    @ManyToMany(mappedBy = "categories")
    List<Evenement> evenements;
}
