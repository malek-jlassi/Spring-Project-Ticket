package tn.esprit.testspring_malek.Services.Internaute;

import tn.esprit.testspring_malek.Entities.Internaute;
import tn.esprit.testspring_malek.Entities.TrancheAge;

import java.time.LocalDate;

public interface IInternauteService {
    Internaute ajouterInternaute(Internaute internaute);
    Long nbInternauteParTrancheAgeEtDateEvenement(TrancheAge trancheAge, LocalDate dateMin, LocalDate dateMax);

    String internauteLePlusActif();
}
