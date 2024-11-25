package tn.esprit.testspring_malek.RestControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tn.esprit.testspring_malek.Entities.Evenement;
import tn.esprit.testspring_malek.Entities.Internaute;
import tn.esprit.testspring_malek.Services.Evenement.IEvenementService;

@RestController
@AllArgsConstructor
@RequestMapping("EvenementRestController")
@Tag(name = "Evenement APIs", description = "Manage Evenement operations like CRUD")


public class EvenementController {
    IEvenementService evenementService;

    @Operation(summary = "Add a new event", description = "Create a new internaute")
    @PostMapping("ajouterEvenement")
    public Evenement ajouterEvenement(@RequestBody Evenement evenement) {

        return evenementService.ajouterEvenement(evenement);
    }
}
