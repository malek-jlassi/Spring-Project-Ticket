package tn.esprit.testspring_malek.RestControllers;


import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.testspring_malek.Entities.Categorie;

import tn.esprit.testspring_malek.Services.Category.ICategorieService;

@RestController
@AllArgsConstructor
@RequestMapping("CategorieRestController")
@Tag(name = "Categorie APIs", description = "Manage Categorie operations like CRUD")



public class CategorieController {

    ICategorieService categorieService;

    @Operation(summary = "Add a new Categorie", description = "Create a new Categorie")
    @PostMapping("ajouterCategorie")
    public Categorie categorieService(@RequestBody Categorie catego) {

        return categorieService.ajouterCategorie(catego);
    }

    @Operation(summary = "get a new date", description = "get a new date")
    @GetMapping("/GetListCategorie")
    public void listeEvenementsParCategorie() {
        categorieService.listeEvenementsParCategorie(); // Call the service method
    }
}
