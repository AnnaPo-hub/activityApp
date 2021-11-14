package activityApp.utils;

import activityApp.domain.Trip;

import java.time.LocalDate;
import java.time.ZoneId;

public class Utils {

    public static void getAllActivityForGivenTrip(Trip trip) {
        final long after = transferLocalDateToEpoch(trip.getStart());
        final long before = transferLocalDateToEpoch(trip.getFinish());

// вызвать адаптер страва
    }

    public static long transferLocalDateToEpoch(LocalDate localdate) {
        ZoneId zoneId = ZoneId.systemDefault();
        return localdate.atStartOfDay(zoneId).toEpochSecond();
    }
}



