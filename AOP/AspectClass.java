package tn.esprit.testspring_malek.AOP;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;

@Aspect
@Slf4j


public class AspectClass {

    @AfterThrowing("execution(* tn.esprit.testspring_malek.Services.Ticket.TicketService.ajouterTicketsEtAffectuerAEvenementEtInternaute(..))")
    public void afficher(){
        log.warn("Le nombre de places restantes dépasse le nombre de tickets demandés");
    }
}
