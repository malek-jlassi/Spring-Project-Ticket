package tn.esprit.testspring_malek.Schedular;

import lombok.AllArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import tn.esprit.testspring_malek.Services.Category.ICategorieService;

@AllArgsConstructor


public class SchedularTest {
    ICategorieService categorieService;


    //    @Scheduled(cron = "*/15 * * * * *" )
    @Scheduled(fixedRate = 15000)
    public void listeEventParCategorie() {
         categorieService.listeEvenementsParCategorie();
    }
}
