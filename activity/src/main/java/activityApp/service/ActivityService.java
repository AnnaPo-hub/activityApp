package activityApp.service;

import activityApp.domain.Activity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActivityService {
    //дергает страву и  сохраняет лист активностей в БД
   List<Activity> getActivitiesByPeriod(long before, long after);
}
