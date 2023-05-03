package gestionStagiaires.projet.de.stage.service;

import gestionStagiaires.projet.de.stage.entities.JourneeStagiaire;
import gestionStagiaires.projet.de.stage.repositories.JourneeStagiaireRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class JourneeStagiaireServiceImpl implements JourneeStagiaireService{
    @Autowired
    private JourneeStagiaireRepository journeeStagiaireRepository;

    @Override
    public List<JourneeStagiaire> listeJourneeStagiaire() {

        return journeeStagiaireRepository.findAll();
    }

    @Override
    public JourneeStagiaire rechercherJourneeStagiaire(int idJourneeStagiaire) {
        return journeeStagiaireRepository.findById(idJourneeStagiaire).get();
    }

    @Override
    public JourneeStagiaire enregistrerJourneeStagiaire(JourneeStagiaire journeeStagiaire) {
        return journeeStagiaireRepository.save(journeeStagiaire);
    }

    @Override
    public JourneeStagiaire rechercherParDateJournee(Date dateJournee) {
        return journeeStagiaireRepository.findByDateJournee(dateJournee);
    }
    @Override
    public void supprimerJourneeStagiaire(int idJourneeStagiaire) {

        journeeStagiaireRepository.deleteById(idJourneeStagiaire);
    }
}
