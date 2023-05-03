package gestionStagiaires.projet.de.stage.repositories;

import gestionStagiaires.projet.de.stage.entities.JourneeStagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ExportRepository extends JpaRepository<JourneeStagiaire, Integer>  {
}
