package gestionStagiaires.projet.de.stage.entities;


import javax.persistence.Entity;

@Entity
public class FileStorageException extends RuntimeException {
    public FileStorageException(String message) {
        super(message);
    }

    public FileStorageException(String message, Throwable cause) {
        super(message, cause);
    }
}
