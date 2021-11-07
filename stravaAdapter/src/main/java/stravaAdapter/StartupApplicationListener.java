package stravaAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private Adapter adapter;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        adapter.getActivities(1636130496, 1635529296, 1,  30);
    }
}
