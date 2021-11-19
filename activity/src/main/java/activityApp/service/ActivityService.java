package activityApp.service;

import activityApp.domain.Activity;

import java.util.List;

public interface ActivityService {
    List<Activity> getActivitiesByTripId(long before, long after);
}
