package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.sidecar.EnableSidecar;

/**
 * @author marcos.barbero
 */
@EnableSidecar
@SpringCloudApplication
public class SidecarApplication {

    public static void main(String... args) {
        SpringApplication.run(SidecarApplication.class, args);
    }
}
