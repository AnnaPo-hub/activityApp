package stravaAdapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;
import stravaAdapter.configuration.StravaIntegrationConfiguration;

@SpringBootApplication
@Import(StravaIntegrationConfiguration.class)
public class App {
    public static void main(String[] args){
        SpringApplication.run(App.class);
    }
}
