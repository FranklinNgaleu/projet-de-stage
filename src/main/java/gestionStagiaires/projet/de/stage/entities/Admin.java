package gestionStagiaires.projet.de.stage.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
public class Admin {
    @Column(name = "idAdmin")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int idAdmin;

    private String login;

    private String password;

    private String nom;

    private String prenom;

    private String contact;


    @OneToMany(mappedBy = "admin")
    @JsonIgnore
    private Set<Stagiaire> stagiaire = new HashSet<>();

    public int getIdAdmin() {
        return idAdmin;
    }

    public void setIdAdmin(int idAdmin) {
        this.idAdmin = idAdmin;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
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

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public Set<Stagiaire> getStagiaire() {
        return stagiaire;
    }

    public void setStagiaire(Set<Stagiaire> stagiaire) {
        this.stagiaire = stagiaire;
    }
}
