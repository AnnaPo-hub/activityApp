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
        strava_oauth.setAccessToken("e798eb3faa5705554e532c2fb58729947482b948");
        return apiClient;
    }
}
