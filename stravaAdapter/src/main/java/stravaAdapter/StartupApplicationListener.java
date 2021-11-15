package stravaAdapter;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class StartupApplicationListener implements ApplicationListener<ContextRefreshedEvent> {

    @Autowired
    private Adapter adapter;

    private Integer before; //1636130496
    private Integer after;//1635529296
    private static Integer page = 1;
    private static  Integer perPage = 30;

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        adapter.getActivities(before, after, page,  perPage);
    }
}
