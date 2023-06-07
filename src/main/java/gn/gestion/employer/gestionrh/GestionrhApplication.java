package gn.gestion.employer.gestionrh;

import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@SpringBootApplication
public class GestionrhApplication implements CommandLineRunner {


    @Autowired
    private ConfigurationProperties configurationProperties;


    public static void main(String[] args) {
        SpringApplication.run(GestionrhApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

    }
}
