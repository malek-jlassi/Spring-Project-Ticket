package tn.esprit.testspring_malek.Entities;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@Table(name = "Internaute")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)

public class Internaute {

    @Id
    @Column(name = "id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idInternaute;


    @Column(nullable = false)
    String identifiant;

    @Enumerated(EnumType.STRING)
    TrancheAge trancheAge;


   // @OneToMany(cascade = CascadeType.ALL, mappedBy = "id_Ticket")
    @OneToMany(mappedBy = "internaute", cascade = CascadeType.ALL)
    List<Ticket> tickets;
}
