package ie.atu.week4project;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class Week4ProjectApplication {

    public static void main(String[] args) {
        SpringApplication.run(Week4ProjectApplication.class, args);
    }

}
