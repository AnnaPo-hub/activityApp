package stravaAdapter.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.otus.activity.client.api.ActivitiesApi;
import ru.otus.activity.client.invoker.ApiClient;
import ru.otus.activity.client.invoker.auth.OAuth;

@Configuration
public class StravaIntegrationConfiguration {

    @Bean
    public ActivitiesApi stravaApi() {
        return new ActivitiesApi(apiClient());
    }

    @Bean
    public ApiClient apiClient() {
        ApiClient apiClient = new ApiClient();
        OAuth strava_oauth = (OAuth) apiClient.getAuthentication("strava_oauth");
        strava_oauth.setAccessToken("b61cae055cfb0ddb8377fc054ffd3b405da497ce");
        return apiClient;
    }
}
