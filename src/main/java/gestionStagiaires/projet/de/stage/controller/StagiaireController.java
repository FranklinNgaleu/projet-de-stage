package gestionStagiaires.projet.de.stage.controller;

import gestionStagiaires.projet.de.stage.entities.ResourceNotFoundException;
import gestionStagiaires.projet.de.stage.entities.Stagiaire;
import gestionStagiaires.projet.de.stage.repositories.StagiaireRepository;
import gestionStagiaires.projet.de.stage.service.StagiaireService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("api/stagiaire/")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class StagiaireController {

    @Autowired
    private StagiaireService stagiaireService;

    @Autowired
    private StagiaireRepository stagiaireRepository;



    @PostMapping("enregistrerStagiaire")
    public Stagiaire enregistrerStagiaire(@RequestBody Stagiaire stagiaire){
        System.out.println(stagiaire);
        return stagiaireService.enregistrerStagiaire(stagiaire);
    }

    @GetMapping("listeStagiaire")
    public List<Stagiaire> listeStagiaire(){
        return stagiaireService.listeStagiaire();
    }

    @GetMapping("rechercher/{idStagiare}")
    public Stagiaire recherche(@PathVariable int idStagiaire){
        return stagiaireService.rechercherStagiaire(idStagiaire);
    }


    @DeleteMapping("supprimerStagiaire/{idStagiaire}")
    public Map<String, Boolean> deleteStagiaire(@PathVariable int idStagiaire)
            throws ResourceNotFoundException {
        Stagiaire Stagiaire = stagiaireRepository.findById(idStagiaire)
                .orElseThrow(() -> new ResourceNotFoundException("Stagiaire not found  id :: " + idStagiaire));
        stagiaireRepository.delete(Stagiaire);
        Map<String, Boolean> response = new HashMap<>();
        response.put("deleted", Boolean.TRUE);
        return response;
    }





}
