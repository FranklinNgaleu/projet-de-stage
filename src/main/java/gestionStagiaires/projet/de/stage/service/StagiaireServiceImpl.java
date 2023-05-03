package gestionStagiaires.projet.de.stage.service;

import gestionStagiaires.projet.de.stage.entities.Stagiaire;
import gestionStagiaires.projet.de.stage.repositories.StagiaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StagiaireServiceImpl implements StagiaireService {

    @Autowired
    private StagiaireRepository stagiaireRepository;

    @Override
    public List<Stagiaire> listeStagiaire() {
        return stagiaireRepository.findAll();
    }

    @Override
    public Stagiaire rechercherStagiaire(int idStagiaire) {
        return stagiaireRepository.findById(idStagiaire).get();
    }

    @Override
    public Stagiaire enregistrerStagiaire(Stagiaire stagiaire) {
        return stagiaireRepository.save(stagiaire);
    }
    /*@Override
    public Stagiaire rechercherLoginPassword(String login, String password) {
        return StagiaireRepository.findByLoginAndPassword(login,password);
    }*/
    @Override
      public Stagiaire rechercherParIdStagiaire(int idStagiaire) {
         return stagiaireRepository.findByIdStagiaire(idStagiaire);
     }
    @Override
    public void supprimerStagiaire(int idStagiaire) {
        stagiaireRepository.deleteById(idStagiaire);
    }

    }
