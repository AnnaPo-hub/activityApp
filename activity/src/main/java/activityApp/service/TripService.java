package activityApp.service;

import activityApp.domain.Trip;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface TripService {
    Trip insert(Trip trip);

    List<Trip> getAll();

    void deleteById(Long id);

  //  Trip edit  (Trip trip);

    //getEquipment нужный для этого вида активности
}
