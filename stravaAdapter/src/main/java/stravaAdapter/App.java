package stravaAdapter;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import java.sql.SQLException;

@SpringBootApplication
@Import(StravaIntegrationConfiguration.class)
public class App {
//    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
//    @Autowired
//    TripDao tripDao;
//
//    @Autowired
//    ActivityDao activityDao;


    public static void main(String[] args) throws SQLException {
        SpringApplication.run(App.class);
        Adapter.getActivities(1636130496, 1635529296, 1,  30);

    }
}
