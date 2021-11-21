package activityApp.service;

import activityApp.dao.TripDao;
import activityApp.domain.Trip;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

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
}
