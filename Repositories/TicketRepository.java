package tn.esprit.testspring_malek.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import tn.esprit.testspring_malek.Entities.Ticket;
import tn.esprit.testspring_malek.Entities.TypeTicket;

public interface TicketRepository extends JpaRepository<Ticket, Long> {

    @Query("SELECT SUM(t.prixTicket) FROM Ticket t WHERE t.evenement.nomEvenement = :nomEvt AND t.typeTicket = :typeTicket")
    Double calculateMontantRecupere(String nomEvt, TypeTicket typeTicket);

    int countByInternauteIdInternaute(Long idInternaute);
}
