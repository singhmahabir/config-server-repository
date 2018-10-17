package singh.mahabir.config;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 *
 * @author Mahabir Singh
 *
 */

@SpringBootApplication

/*
 * To start config server you have to use @EnableConfigServe
 */
@EnableConfigServer

/*
 * this annotation is required when Config-client will consumed properties files through registry server.
 */
@EnableEurekaClient
public class ConfigServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
