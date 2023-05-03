package gestionStagiaires.projet.de.stage.service;

import gestionStagiaires.projet.de.stage.entities.Admin;



import java.util.List;


public interface AdminService {
    Admin enregistrerAdmin(Admin admin);

    List<Admin> listAdmin();

    Admin rechercherLoginAndPassword(String login, String password);
}
