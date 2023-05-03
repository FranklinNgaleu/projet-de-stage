package gestionStagiaires.projet.de.stage.controller;

import gestionStagiaires.projet.de.stage.entities.Admin;
import gestionStagiaires.projet.de.stage.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/admin/")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class AdminController {

    @Autowired
    private AdminService adminService;

    @PostMapping("")
    public Admin enregistrerAdmmin(@RequestBody Admin admin){
        return adminService.enregistrerAdmin(admin);
    }

    @GetMapping("listAdmin")
    public List<Admin> listAdmin(){
        return adminService.listAdmin();
    }


    @GetMapping("connexion/{login}/{password}")
    public Admin connexion(@PathVariable String login, @PathVariable String password){
        Admin admin = null;
        admin = adminService.rechercherLoginAndPassword(login, password);
        if(admin == null){
            return null;
        }else {
            System.out.println(admin);
            return admin;
        }
    }


}
