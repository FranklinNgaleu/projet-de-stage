package gestionStagiaires.projet.de.stage.repositories;

import gestionStagiaires.projet.de.stage.entities.JourneeStagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


import java.util.Date;

@Repository
public interface JourneeStagiaireRepository extends JpaRepository<JourneeStagiaire,Integer> {
    JourneeStagiaire findByDateJournee(Date dateJournee);
}
