package gestionStagiaires.projet.de.stage.entities;

import org.springframework.boot.context.properties.ConfigurationProperties;

import javax.persistence.Entity;


@Entity
@ConfigurationProperties(prefix = "file")
public class FileStorageProperties {

    private String uploadDir;

    public String getUploadDir() {
        return uploadDir;
    }

    public void setUploadDir(String uploadDir) {
        this.uploadDir = uploadDir;
    }


}
