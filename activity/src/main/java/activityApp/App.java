package activityApp;

import activityApp.service.ActivityService;
import org.h2.tools.Console;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.sql.SQLException;

@SpringBootApplication
public class App {

    public static void main(String[] args) throws SQLException {
        ConfigurableApplicationContext ctx =  SpringApplication.run(App.class);
        ctx.getBean(ActivityService.class).getActivitiesByPeriod(1636130496,1635529296);

         Console.main(args);
    }
}
