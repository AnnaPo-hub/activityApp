package stravaAdapter.configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;
import stravaAdapter.service.Adapter;

@Component
public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private Adapter adapter;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        adapter.getActivities(1636130496, 1635529296, 1, 30);
    }
}
