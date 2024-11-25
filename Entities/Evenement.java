package tn.esprit.testspring_malek.Entities;

import jakarta.persistence.*;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;
import java.util.List;


@Entity
@Table(name = "Evenement")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Evenement {

    @Id
    @Column(name = "identifiant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idEvenement;

    @Column(nullable = false)
    String nomEvenement;

    @Column(nullable = false)
    long nbPlacesRestants;

    LocalDate dateEvenement;

    @OneToMany(mappedBy = "evenement", cascade = CascadeType.ALL)
    List<Ticket> tickets;

    @ManyToMany
    List<Categorie> categories;
}
