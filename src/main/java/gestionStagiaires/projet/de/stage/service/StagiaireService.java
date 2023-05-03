package gestionStagiaires.projet.de.stage.service;

import gestionStagiaires.projet.de.stage.entities.Stagiaire;

import java.util.List;

public interface StagiaireService {
    List<Stagiaire> listeStagiaire();
    Stagiaire rechercherStagiaire(int idStagiaire);
    Stagiaire enregistrerStagiaire(Stagiaire stagiaire);
    Stagiaire rechercherParIdStagiaire(int idStagiaire);
    //Stagiaire rechercherLoginPassword(String login, String password);
    void supprimerStagiaire(int idStagiaire);
}
