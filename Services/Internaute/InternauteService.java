package tn.esprit.testspring_malek.Services.Internaute;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testspring_malek.Entities.Internaute;
import tn.esprit.testspring_malek.Entities.TrancheAge;
import tn.esprit.testspring_malek.Repositories.InternauteRepository;
import tn.esprit.testspring_malek.Repositories.TicketRepository;

import java.time.LocalDate;

@Service
@AllArgsConstructor

public class InternauteService implements IInternauteService {



    InternauteRepository internauteRepository;
    TicketRepository ticketRepository;

    @Override
    public Internaute ajouterInternaute(Internaute internaute) {
        return internauteRepository.save(internaute);
    }

    @Override
    public Long nbInternauteParTrancheAgeEtDateEvenement(TrancheAge trancheAge, LocalDate dateMin, LocalDate dateMax) {
        return internauteRepository.countByTrancheAgeAndTicketsEvenementDateEvenementBetween(trancheAge, dateMin, dateMax);
    }


    @Override
    public String internauteLePlusActif() {

        String identifiant = "";
        int max = 0;
        //Internaute internaute = internauteRepository.findAll();
for( Internaute internaute : internauteRepository.findAll())
{
    if(ticketRepository.countByInternauteIdInternaute(internaute.getIdInternaute())> max ) {
        max = ticketRepository.countByInternauteIdInternaute(internaute.getIdInternaute());
        identifiant = internaute.getIdentifiant();
    }
    }

       return identifiant;
    }
}
