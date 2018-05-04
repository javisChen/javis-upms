package javis.app;

import org.springframework.boot.ResourceBanner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.core.io.ClassPathResource;

@SpringBootApplication
@EnableAutoConfiguration
@ServletComponentScan
public class BootstrapApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication();
        application.setBanner(new ResourceBanner(new ClassPathResource("banner.txt")));
        SpringApplication.run(BootstrapApplication.class, args);
    }

}
