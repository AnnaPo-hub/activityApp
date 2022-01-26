package activityApp.dao;

import activityApp.domain.Activity;
import activityApp.utils.ActivityTotal;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface ActivityDao extends JpaRepository<Activity, Long> {
    @Query(value = "Select type as type, sum(distance ) as  totalDistance " +
            "From  Activity " +
            "Where trip_id = :trip_id " +
            "Group by type")
    List<ActivityTotal> countDistanceByType(@Param("trip_id") long trip_id);
}
