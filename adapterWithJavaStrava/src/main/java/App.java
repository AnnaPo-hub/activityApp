import javastrava.api.v3.auth.AuthorisationService;
import javastrava.api.v3.auth.impl.retrofit.AuthorisationServiceImpl;
import javastrava.api.v3.auth.model.Token;
import javastrava.api.v3.model.StravaActivity;
import javastrava.api.v3.service.Strava;

import java.time.LocalDateTime;
import java.util.List;

public class App {
    public static void main(String[] args) {
        AuthorisationService service = new AuthorisationServiceImpl();
        Token token = service.tokenExchange(73627, "726d1d4cee077edac54f61eaac3f8c5f4eda1a7c", "4328e30cdbc14d73d3792199da3ac99d51900a8f");
        Strava strava = new Strava(token);
        final List<StravaActivity> stravaActivities = strava.listAuthenticatedAthleteActivities(LocalDateTime.of(2021, 10, 17, 0, 0), LocalDateTime.of(2021, 10, 2, 0, 0));
//
//        API api = new API(token);
//        final StravaActivity[] stravaActivities = api.listAuthenticatedAthleteActivities(1636130496, 1635529296, 1, 30);
        System.out.println("ВСЕГО АКТИВНОСТЕЙ  ЗАГРУЖЕНО "+ stravaActivities.size());




    }
}

