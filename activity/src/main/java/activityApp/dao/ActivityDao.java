package activityApp.dao;

import activityApp.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ActivityDao extends JpaRepository<Activity,Long> {

    List<Activity> getActivitiesByTripId(long trip_id);
}
