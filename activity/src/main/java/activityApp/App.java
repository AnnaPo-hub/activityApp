package activityApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.sql.SQLException;

@SpringBootApplication
public class App {
//    @SuppressWarnings("SpringJavaAutowiredFieldsWarningInspection")
//    @Autowired
//    TripDao tripDao;
//
//    @Autowired
//    ActivityDao activityDao;


    public static void main(String[] args) throws SQLException {
        SpringApplication.run(App.class);

      //  Console.main(args);
    }
}
