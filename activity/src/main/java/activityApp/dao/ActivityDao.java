package activityApp.dao;

import activityApp.domain.Activity;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ActivityDao extends JpaRepository<Activity, Long> {
    @Query(value = "Select typeOfActivity as typeOfActivity, sum(distance ) as  totalDistance " +
            "From  Activity " +
            "Group by typeOfActivity")
    List<ActivityTotal> countDistanceByTypeOfActivity(long trip_id);
}
