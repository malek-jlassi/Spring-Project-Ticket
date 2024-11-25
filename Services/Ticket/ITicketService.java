package tn.esprit.testspring_malek.Services.Ticket;

import tn.esprit.testspring_malek.Entities.Ticket;
import tn.esprit.testspring_malek.Entities.TypeTicket;

import java.util.List;

public interface ITicketService {

    List<Ticket> ajouterTicketsEtAffectuerAEvenementEtInternaute(List<Ticket> tickets, Long idEvenement, Long idInternaute);
    Double montantRecupereParEvtEtTypeTicket(String nomEvt, TypeTicket typeTicket);
}
