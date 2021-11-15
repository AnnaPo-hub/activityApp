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
        strava_oauth.setAccessToken("8eafd7493ded2652a3e0d13f1e96c8c493457f06");
        return apiClient;
    }
}
