package application;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EntityScan(basePackages="entity")
@EnableJpaRepositories(basePackages="repository")
@ComponentScan(basePackages="controller")
public class Application{

public static void main(String[] args) {
SpringApplication.run(Application.class, args);

}

/*
 
   
  insert into usuario values (null,'lu','123');
  insert into usuario values (null,'jansen','123');
  insert into usuario values (null,'garra','123');
  
 */

}


