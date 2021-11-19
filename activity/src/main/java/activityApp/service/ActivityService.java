package activityApp.service;

import activityApp.domain.Activity;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface ActivityService {
    List<Activity> getActivitiesByTripId(long before, long after);
}
