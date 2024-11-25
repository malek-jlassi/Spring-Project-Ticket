package tn.esprit.testspring_malek.RestControllers;


import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspring_malek.Entities.Ticket;
import tn.esprit.testspring_malek.Entities.TypeTicket;
import tn.esprit.testspring_malek.Services.Ticket.ITicketService;

import java.util.List;

@RestController
@AllArgsConstructor
@RequestMapping("TicketRestController")
@Tag(name = "Ticket APIs", description = "Manage Ticket operations like CRUD")


public class TicketController {
 ITicketService ticketService;

    @PostMapping("ajouterTicketsEtAffecterAEvenementEtInternaute")
    List<Ticket> ajouterTicketsEtAffecterAEvenementEtInternaute(@RequestBody List<Ticket> tickets, @RequestParam Long idEvenement, @RequestParam Long idInternaute) {
        return ticketService.ajouterTicketsEtAffectuerAEvenementEtInternaute(tickets, idEvenement, idInternaute);
    }

    @GetMapping("calculateMontantTicket")
    Double calculateMontantTicket(@RequestParam String nomEvent, @RequestParam TypeTicket typeTicket) {
        return ticketService.montantRecupereParEvtEtTypeTicket(nomEvent, typeTicket);
    }
}
