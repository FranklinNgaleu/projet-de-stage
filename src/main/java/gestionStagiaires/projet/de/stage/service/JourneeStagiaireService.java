package gestionStagiaires.projet.de.stage.service;

import gestionStagiaires.projet.de.stage.entities.JourneeStagiaire;

import java.util.Date;
import java.util.List;

public interface JourneeStagiaireService {

    List<JourneeStagiaire> listeJourneeStagiaire();
    JourneeStagiaire rechercherJourneeStagiaire(int idJourneeStagiaire);
    JourneeStagiaire enregistrerJourneeStagiaire(JourneeStagiaire journeeStagiaire);
    JourneeStagiaire rechercherParDateJournee(Date dateJournee);

    void supprimerJourneeStagiaire(int idJourneeStagiaire);
}
