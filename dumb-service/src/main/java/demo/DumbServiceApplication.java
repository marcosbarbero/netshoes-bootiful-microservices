package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

@SpringCloudApplication
public class DumbServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DumbServiceApplication.class, args);
    }
}

@Configuration
@RestController
class DumbController {

    @RequestMapping("/names")
    public Collection<String> dumbService() {
        return Arrays.asList("Athos", "Aramis", "Porthos");
    }
}
