package tn.esprit.testspring_malek.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.testspring_malek.Entities.Categorie;

public interface CategorieRepository extends JpaRepository<Categorie, Long> {
}
