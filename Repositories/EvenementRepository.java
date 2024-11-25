package tn.esprit.testspring_malek.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspring_malek.Entities.Evenement;

public interface EvenementRepository extends JpaRepository<Evenement, Long> {
}
