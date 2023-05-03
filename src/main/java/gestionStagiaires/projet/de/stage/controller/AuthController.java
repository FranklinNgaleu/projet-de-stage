package gestionStagiaires.projet.de.stage.controller;

import gestionStagiaires.projet.de.stage.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("api/auth/")
public class AuthController {
    @Autowired
    private AdminService adminService;
}
