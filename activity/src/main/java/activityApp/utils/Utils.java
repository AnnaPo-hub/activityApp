package activityApp.utils;

import activityApp.domain.Trip;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.ZoneId;
@UtilityClass
public class Utils {

    public long transferLocalDateToEpoch(LocalDate localdate) {
        ZoneId zoneId = ZoneId.systemDefault();
        return localdate.atStartOfDay(zoneId).toEpochSecond();
    }

    public long getTripStartDate(Trip trip) {
        return transferLocalDateToEpoch(trip.getStart());
    }

    public static long getTripFinishDate(Trip trip) {
        return transferLocalDateToEpoch(trip.getFinish());
    }
}



