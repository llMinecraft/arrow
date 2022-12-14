package mc.exarrow.arrow;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationExtensionsKt;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ArrowApplication {
    public static void main(String[] args) {
        System.setProperty("apollo.config-service", "http://austin.apollo.config:5001");
        SpringApplication.run(ArrowApplication.class,args);
    }
}
