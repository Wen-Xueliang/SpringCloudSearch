package eng.lab.eurekaclientaa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class EurekaClientAApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientAApplication.class, args);
    }

}
