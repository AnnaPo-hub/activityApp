import javastrava.api.v3.auth.model.Token;
import javastrava.api.v3.auth.model.TokenResponse;
import javastrava.api.v3.rest.API;
import javastrava.api.v3.rest.AuthorisationAPI;
import javastrava.api.v3.service.Strava;

public class test {
    public static void main(String[] args) {


        AuthorisationAPI auth = API.authorisationInstance();
        TokenResponse response = auth.tokenExchange(73627, "726d1d4cee077edac54f61eaac3f8c5f4eda1a7c", "5f67663981a5406a94ae363c94226117803e8aa6");
        Token token = new Token(response);

        API api = new API(token);
        Strava strava = new Strava(token);

        System.out.println(strava.getAthlete(48834033).toString());
        //final StravaAthlete athlete = api.getAthlete(48834033);

        //StravaAthlete athlete = api.getAthlete(48834033);
//        final StravaActivity[] stravaActivities = api.listAuthenticatedAthleteActivities(1636130496, 1635529296, 1, 30);
//        System.out.println("НАШЛИ ТАКУЮ  АКТИВНОСТЬ "+ stravaActivities[1]);

    }
}
