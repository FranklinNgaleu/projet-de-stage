package gestionStagiaires.projet.de.stage;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.hibernate3.LocalSessionFactoryBean;


@SpringBootApplication()
@EntityScan(basePackages="gestionStagiaires.projet.de.stage.entities")
@EnableJpaRepositories(basePackages="gestionStagiaires.projet.de.stage.repositories")
public class ProjetDeStageApplication {


	public static void main(String[] args)
	{
		SpringApplication.run(ProjetDeStageApplication.class, args);

	}

}
