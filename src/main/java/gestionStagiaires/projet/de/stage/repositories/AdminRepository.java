package gestionStagiaires.projet.de.stage.repositories;

import gestionStagiaires.projet.de.stage.entities.Admin;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface AdminRepository extends JpaRepository<Admin,Integer> {
    Admin findByLoginAndPassword(String login, String password);
}
