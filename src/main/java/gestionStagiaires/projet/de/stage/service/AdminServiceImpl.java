package gestionStagiaires.projet.de.stage.service;

import gestionStagiaires.projet.de.stage.entities.Admin;
import gestionStagiaires.projet.de.stage.repositories.AdminRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;



@Service
public class AdminServiceImpl implements AdminService {


    @Autowired
    private AdminRepository adminRepository;

    @Override
    public Admin enregistrerAdmin(Admin admin) {
        return adminRepository.save(admin);
    }

    @Override
    public List<Admin> listAdmin() {
        return adminRepository.findAll();
    }


    @Override
    public Admin rechercherLoginAndPassword(String login, String password) {
        return adminRepository.findByLoginAndPassword(login,password);
    }

}
