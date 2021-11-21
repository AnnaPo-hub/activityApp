package activityApp.dao;

import activityApp.domain.Trip;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;

@Component
public interface TripDao extends JpaRepository<Trip, Long> {

}
