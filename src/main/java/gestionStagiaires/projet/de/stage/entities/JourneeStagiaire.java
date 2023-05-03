package gestionStagiaires.projet.de.stage.entities;


import com.lowagie.text.Document;
import lombok.*;


import javax.persistence.*;


import java.time.LocalTime;

import java.util.Date;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
@Data
public class JourneeStagiaire extends Document {

    @Column(name = "idJourneeStagiaire")
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)

    private int idJourneeStagiaire;

    private String nom;

    private LocalTime heureDebut;

    private LocalTime heureFin;

    private Date dateJournee ;

    public LocalTime getHeureDebut() {
        return heureDebut;
    }

    public void setHeureDebut(LocalTime heureDebut) {
        this.heureDebut = heureDebut;
    }

    public LocalTime getHeureFin() {
        return heureFin;
    }


    public void setHeureFin(LocalTime heureFin) {
        this.heureFin = heureFin;
    }

    public Date getDateJournee() {
        return dateJournee;
    }

    public void setDateJournee(Date dateJournee) {
        this.dateJournee = dateJournee;
    }


    public int getIdJourneeStagiaire() {
        return idJourneeStagiaire;
    }

    public void setIdJourneeStagiaire(int idJourneeStagiaire) {
        this.idJourneeStagiaire = idJourneeStagiaire;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "idStagiaire")
    private Stagiaire stagiaire;



}
