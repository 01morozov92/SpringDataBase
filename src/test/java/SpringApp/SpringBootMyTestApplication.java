package SpringApp;

import lombok.extern.log4j.Log4j2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@Log4j2
@ComponentScan(basePackages = {"Spring", "Entity", "Repos", "SpringApp"})
@SpringBootApplication(exclude={DataSourceAutoConfiguration.class})
public class SpringBootMyTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringBootMyTestApplication.class, args);
    }
}
