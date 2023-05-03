package gestionStagiaires.projet.de.stage.entities;


import javax.persistence.Entity;

@Entity
public class MyFileNotFoundException extends RuntimeException {
    public MyFileNotFoundException(String message) {
        super(message);
    }

    public MyFileNotFoundException(String message, Throwable cause) {
        super(message, cause);
    }
}
