package tn.esprit.testspring_malek.Services.Evenement;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.testspring_malek.Entities.Evenement;
import tn.esprit.testspring_malek.Repositories.EvenementRepository;

@Service
@AllArgsConstructor

public class EvenementService implements IEvenementService{

    EvenementRepository evenementRepository;

    @Override
    public Evenement ajouterEvenement(Evenement evenement) {
        return evenementRepository.save(evenement);
    }
}
