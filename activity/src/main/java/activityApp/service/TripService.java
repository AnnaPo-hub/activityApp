package activityApp.service;

import activityApp.domain.Activity;
import activityApp.domain.Trip;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public interface TripService {
    Trip insert(Trip trip);

    List<Trip> getAll();

    Trip getTripById(Long id);

    void deleteById(Long id);

  //  Trip edit  (Trip trip);

    Map<String, Integer> getTripStatistics(List<Activity> activities);

    //getEquipment нужный для этого вида активности
}
