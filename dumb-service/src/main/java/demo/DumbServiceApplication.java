package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.Collection;

//@EnableCaching
//@EnableResourceServer
@SpringCloudApplication
public class DumbServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(DumbServiceApplication.class, args);
    }
}

@RestController
class DumbController {

    @RequestMapping("/musketeers")
//    @Cacheable("musketeers")
    public Collection<String> musketeers() {
        return Arrays.asList("Athos", "Aramis", "Porthos");
    }
}
