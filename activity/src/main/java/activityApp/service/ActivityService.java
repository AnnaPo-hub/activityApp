package activityApp.service;

import activityApp.domain.Activity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActivityService {
    //дергает страву и  сохраняет лист активносте в БД
    List<Activity> getActivitiesByTripId(long before, long after);
}
