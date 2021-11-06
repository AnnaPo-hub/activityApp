package stravaAdapter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.otus.activity.client.api.ActivitiesApi;
import ru.otus.activity.client.invoker.ApiClient;

@Configuration
public class StravaIntegrationConfiguration {

    @Bean
    public ActivitiesApi stravaApi(){
        return new ActivitiesApi(apiClient());
    }

    @Bean
    public ApiClient apiClient(){
        return new ApiClient();
    }
}
