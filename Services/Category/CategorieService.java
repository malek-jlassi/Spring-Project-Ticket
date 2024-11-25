package tn.esprit.testspring_malek.Services.Category;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;
import tn.esprit.testspring_malek.Entities.Categorie;
import tn.esprit.testspring_malek.Entities.Evenement;
import tn.esprit.testspring_malek.Repositories.CategorieRepository;

import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
@AllArgsConstructor
@Slf4j
public class CategorieService implements ICategorieService{

    CategorieRepository categorieRepository;

    @Override
    public Categorie ajouterCategorie(Categorie categorie) {
        return categorieRepository.save(categorie);
    }

    @Override
    public void listeEvenementsParCategorie() {
        for (Categorie categorie : categorieRepository.findAll()) {
            log.info("Categorie " + categorie.getNomCategorie());
            for (Evenement evenement : categorie.getEvenements()) {
                log.info("Evenement " + evenement.getNomEvenement() + " planifié le " + evenement.getDateEvenement());
            }
        }
    }


}
