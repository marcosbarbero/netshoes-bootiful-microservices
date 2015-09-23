package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

@SpringCloudApplication
public class DummieApplication {

    public static void main(String[] args) {
        SpringApplication.run(DummieApplication.class, args);
    }
}

@RestController
class MusketeersController {

    @RequestMapping("/musketeers")
    public Collection<String> musketeers() {
        return Arrays.asList("Athos", "Porthos", "Aramis");
    }

}
