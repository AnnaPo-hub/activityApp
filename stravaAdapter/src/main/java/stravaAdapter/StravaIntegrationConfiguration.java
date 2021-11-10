package stravaAdapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.otus.activity.client.api.ActivitiesApi;
import ru.otus.activity.client.invoker.ApiClient;
import ru.otus.activity.client.invoker.auth.OAuth;

@Configuration
public class StravaIntegrationConfiguration {

    @Bean
    public ActivitiesApi stravaApi(){
        return new ActivitiesApi(apiClient());
    }

    @Bean
    public ApiClient apiClient(){
        ApiClient apiClient = new ApiClient();

        OAuth strava_oauth = (OAuth) apiClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("50c48de7cf58adb03f9a0d8e8a7e7f3a4163f879");
        final String accessToken = strava_oauth.getAccessToken();
        System.out.println(accessToken);
        return apiClient;
    }

}
