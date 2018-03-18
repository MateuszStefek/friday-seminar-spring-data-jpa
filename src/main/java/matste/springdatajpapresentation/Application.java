package matste.springdatajpapresentation;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
/*
 * Put this annotation on any configuration class.
 */
@EnableJpaRepositories
public class Application {
    private static ConfigurableApplicationContext applicationContext;

    public static <T> T getBean(Class<T> clazz) {
        if (applicationContext == null) {
            applicationContext = SpringApplication.run(Application.class, new String[]{});
            applicationContext.getBean(DataCreator.class).createData();
            System.out.println("----------------------------------------------");
            System.out.println("----------------------------------------------");
        }
        return applicationContext.getBean(clazz);
    }
}

