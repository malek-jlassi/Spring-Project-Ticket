package tn.esprit.testspring_malek.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspring_malek.Entities.Internaute;
import tn.esprit.testspring_malek.Entities.TrancheAge;

import java.time.LocalDate;

public interface InternauteRepository extends JpaRepository<Internaute, Long> {

//    @Query(value = "SELECT COUNT(DISTINCT i.id) " +
//            "FROM internaute i " +
//            "JOIN ticket t ON i.id = t.internaute_id " +
//            "JOIN evenement e ON t.evenement_id = e.id " +
//            "WHERE i.tranche_age = :trancheAge " +
//            "AND e.date_evenement BETWEEN :dateMin AND :dateMax",
//            nativeQuery = true)
    Long countByTrancheAgeAndTicketsEvenementDateEvenementBetween(TrancheAge trancheAge, LocalDate dateMin,
                                                                  LocalDate dateMax);


}
