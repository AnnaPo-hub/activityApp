package activityApp.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Component;
import activityApp.domain.Trip;


@Component
public interface TripDao extends JpaRepository<Trip, Long> {
}
