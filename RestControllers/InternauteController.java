package tn.esprit.testspring_malek.RestControllers;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspring_malek.Entities.Internaute;
import tn.esprit.testspring_malek.Entities.TrancheAge;
import tn.esprit.testspring_malek.Services.Internaute.IInternauteService;

import java.time.LocalDate;

@RestController
@AllArgsConstructor
@RequestMapping("InternauteRestController")
@Tag(name = "Internaute APIs", description = "Manage Internaute operations like CRUD")


public class InternauteController {

    IInternauteService internauteService;

    @Operation(summary = "Add a new internaute", description = "Create a new internaute")
    @PostMapping("ajouterInternaute")
    public Internaute ajouterInternaute(@RequestBody Internaute internaute) {

        return internauteService.ajouterInternaute(internaute);
    }

    @GetMapping("nbInternauteParTrancheAgeEtDateEvenement")
    Long nbInternauteParTrancheAgeEtDateEvenement(@RequestParam TrancheAge trancheAge, @RequestParam LocalDate dateMin, @RequestParam LocalDate dateMax){
        return internauteService.nbInternauteParTrancheAgeEtDateEvenement(trancheAge,dateMin,dateMax);
    }

    @GetMapping("InternautePlusActif")
    String InternautePlusActif(){

        return internauteService.internauteLePlusActif();
    }
}
