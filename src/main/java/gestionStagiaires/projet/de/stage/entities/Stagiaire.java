package gestionStagiaires.projet.de.stage.entities;


import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Data
public class Stagiaire {
    @Column(name = "idStagiaire")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idStagiaire;

    private String nom;

    private String prenom;

    private String ecole;

    private String niveau;

    private String filiere;

    private String contact;

    private String mail;

    private String periode;


    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idAdmin")
    private Admin admin;

    @OneToMany(mappedBy = "stagiaire")
    @JsonIgnore
    private Set<JourneeStagiaire> journeeStagiaire = new HashSet<>();



    public int getIdStagiaire() {
        return idStagiaire;
    }

    public void setIdStagiaire(int idStagiaire) {
        this.idStagiaire = idStagiaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getEcole() {
        return ecole;
    }

    public void setEcole(String ecole) {
        this.ecole = ecole;
    }

    public String getNiveau() {
        return niveau;
    }

    public void setNiveau(String niveau) {
        this.niveau = niveau;
    }

    public String getFiliere() {
        return filiere;
    }

    public void setFiliere(String filiere) {
        this.filiere = filiere;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getPeriode() {
        return periode;
    }

    public void setPeriode(String periode) {
        this.periode = periode;
    }



    public Admin getAdmin() {
        return admin;
    }

    public void setAdmin(Admin admin) {
        this.admin = admin;
    }

    public Set<JourneeStagiaire> getJourneeStagiaire() {
        return journeeStagiaire;
    }

    public void setJourneeStagiaire(Set<JourneeStagiaire> journeeStagiaire) {
        this.journeeStagiaire = journeeStagiaire;
    }

}
