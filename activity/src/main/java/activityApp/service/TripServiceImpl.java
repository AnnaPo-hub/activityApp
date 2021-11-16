package activityApp.service;

import activityApp.dao.TripDao;
import activityApp.domain.Activity;
import activityApp.domain.Trip;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
@AllArgsConstructor
public class TripServiceImpl implements TripService {

    private final TripDao tripDao;

    @Transactional
    @Override
    public Trip insert(Trip trip) {
        return tripDao.save(trip);
    }

    @Override
    public List<Trip> getAll() {
        return tripDao.findAll();
    }

    @Override
    public Trip getTripById(Long id) {
        return tripDao.getById(id);
    }

    @Transactional
    @Override
    public void deleteById(Long id) {
        tripDao.deleteById(id);
    }

    @Override
    public Map<String, Integer> getTripStatistics(List<Activity> activities) {
        Map<String, Integer> activityMap = new HashMap<>();

        for (Activity act : activities) {
            final String typeOfActivity = act.getTypeOfActivity();

            int distance = activityMap.containsKey(typeOfActivity) ? activityMap.get(typeOfActivity) : 0;

            distance += activityMap.get(distance);
            activityMap.put(typeOfActivity, distance);
            System.out.println(" ");
            for (String key : activityMap.keySet()) {
                System.out.printf("%s: %.2f%n", key, activityMap.get(key));
            }
        }
        return activityMap;
    }
}
