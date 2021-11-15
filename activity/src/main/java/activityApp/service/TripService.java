package activityApp.service;

import activityApp.domain.Activity;
import activityApp.domain.Trip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TripService {
    Trip insert(Trip trip);

    List<Trip> getAll();

    Trip findTripById(Long id);

    void deleteById(Long id);

  //  Trip edit  (Trip trip);

    void getTripStatistics(List<Activity> activities);

    //getEquipment нужный для этого вида активности
}
