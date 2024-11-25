package tn.esprit.testspring_malek.Entities;

import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.FieldDefaults;

import java.util.List;


@Entity
@Table(name = "Ticket")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@FieldDefaults(level = AccessLevel.PRIVATE)


public class Ticket {

    @Id
    @Column(name = "identifiant")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    long idTicket;


    @Column(nullable = false)
    String codeTicket;

    Double prixTicket;

    @Enumerated(EnumType.STRING)
    TypeTicket typeTicket;

    @ManyToOne
    @JoinColumn(name = "internaute_id")
    Internaute internaute;

    @ManyToOne
    //@JoinColumn(name = "evenement_id")
    Evenement evenement;
}
