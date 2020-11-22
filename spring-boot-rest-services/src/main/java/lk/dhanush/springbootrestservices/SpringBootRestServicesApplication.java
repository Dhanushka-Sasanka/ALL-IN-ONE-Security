package lk.dhanush.springbootrestservices;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories(basePackages = {"lk.dhanush.springbootrestservices.repository"})
public class SpringBootRestServicesApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootRestServicesApplication.class, args);
    }

}
