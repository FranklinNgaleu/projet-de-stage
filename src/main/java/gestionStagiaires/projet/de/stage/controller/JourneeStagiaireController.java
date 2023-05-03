package gestionStagiaires.projet.de.stage.controller;


import gestionStagiaires.projet.de.stage.entities.JourneeStagiaire;
import gestionStagiaires.projet.de.stage.service.JourneeStagiaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/journeeStagiaire/")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class JourneeStagiaireController {

    @Autowired
    private JourneeStagiaireService journeeStagiaireService;

    @PostMapping("enregistrerJourneeStagiaire")
    public JourneeStagiaire enregistrerJourneeStagiaire(@RequestBody JourneeStagiaire journeeStagiaire){
        System.out.println(journeeStagiaire);
        return journeeStagiaireService.enregistrerJourneeStagiaire(journeeStagiaire);
    }

    @GetMapping("listeJourneeStagiaire")
    public List<JourneeStagiaire> listeJourneeStagiaire(){
        return journeeStagiaireService.listeJourneeStagiaire();
    }

    @GetMapping("rechercher/{idJourneeStagiaire}")
    public JourneeStagiaire recherche(@PathVariable int idJourneeStagiaire){
        return journeeStagiaireService.rechercherJourneeStagiaire(idJourneeStagiaire);
    }

}
