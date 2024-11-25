package tn.esprit.testspring_malek.Services.Ticket;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testspring_malek.Entities.Evenement;
import tn.esprit.testspring_malek.Entities.Internaute;
import tn.esprit.testspring_malek.Entities.Ticket;
import tn.esprit.testspring_malek.Entities.TypeTicket;
import tn.esprit.testspring_malek.Repositories.EvenementRepository;
import tn.esprit.testspring_malek.Repositories.InternauteRepository;
import tn.esprit.testspring_malek.Repositories.TicketRepository;

import java.util.List;

@Service
@AllArgsConstructor

public class TicketService implements ITicketService {


    TicketRepository ticketRepository;
   EvenementRepository evenementRepository;
   InternauteRepository internauteRepository;

    @Override
    public List<Ticket> ajouterTicketsEtAffectuerAEvenementEtInternaute(List<Ticket> tickets, Long idEvenement, Long idInternaute) {
        Evenement evenement = evenementRepository.findById(idEvenement).get();
        Internaute internaute = internauteRepository.findById(idInternaute).get();
        if(evenement.getNbPlacesRestants()<tickets.size()){
            throw new java.lang.UnsupportedOperationException("nombre de places demandées indisponibe");
        }
        else{
            // cascade
            for (Ticket ticket : tickets) {
                ticket.setEvenement(evenement);
                ticket.setInternaute(internaute);
                // Mise à jour
                evenement.setNbPlacesRestants(evenement.getNbPlacesRestants() - 1);
                evenement = evenementRepository.save(evenement);
            }
            return ticketRepository.saveAll(tickets);
        }
    }


    @Override
    public Double montantRecupereParEvtEtTypeTicket(String nomEvt, TypeTicket typeTicket) {
        return ticketRepository.calculateMontantRecupere(nomEvt, typeTicket);
    }
}
