package activityApp.service;

import activityApp.domain.Activity;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface ActivityService {
    /**
     *
     * @param before  An epoch timestamp to use for filtering activities that have taken place before a certain time
     * @param after An epoch timestamp to use for filtering activities that have taken place after a certain time
     * @param tripId
     * @return List of activities during the given period
     */
   List<Activity> getActivitiesByPeriod(long before, long after, long tripId);
}
