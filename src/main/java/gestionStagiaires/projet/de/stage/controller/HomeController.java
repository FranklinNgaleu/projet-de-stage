package gestionStagiaires.projet.de.stage.controller;

import gestionStagiaires.projet.de.stage.entities.JourneeStagiaire;
import gestionStagiaires.projet.de.stage.repositories.JourneeStagiaireRepository;
import gestionStagiaires.projet.de.stage.service.ExportPdf;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.List;

@RestController
@RequestMapping("api/export/")
@CrossOrigin(origins = "*",allowedHeaders = "*")
public class HomeController {

    @Autowired
    private JourneeStagiaireRepository journeeStagiaireRepository;

    @GetMapping("welcome")
    public String list() {

        return "welcome";
    }

    @GetMapping(value = "exportpdf", produces = MediaType.APPLICATION_PDF_VALUE)
    public ResponseEntity<InputStreamResource> journeeStagiaireReports(HttpServletResponse response) throws IOException {

        List<JourneeStagiaire> allJourneeStagiaires = journeeStagiaireRepository.findAll();

        ByteArrayInputStream bis = ExportPdf.journeeStagiairesReport(allJourneeStagiaires);

        HttpHeaders headers = new HttpHeaders();

        headers.add("Content-Disposition", "attachment;filename=stagiaire.pdf");

        return ResponseEntity.ok().headers(headers).contentType(MediaType.APPLICATION_PDF)
                .body(new InputStreamResource(bis));
    }

}
