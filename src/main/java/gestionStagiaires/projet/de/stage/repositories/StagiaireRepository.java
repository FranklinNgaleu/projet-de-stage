package gestionStagiaires.projet.de.stage.repositories;

import gestionStagiaires.projet.de.stage.entities.Stagiaire;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



@Repository
public interface StagiaireRepository extends JpaRepository<Stagiaire,Integer> {
    Stagiaire findByIdStagiaire(int idStagiaire);

}
