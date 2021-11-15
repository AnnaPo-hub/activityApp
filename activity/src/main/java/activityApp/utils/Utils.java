package activityApp.utils;

import activityApp.domain.Trip;

import java.time.LocalDate;
import java.time.ZoneId;

public class Utils {

    public static long transferLocalDateToEpoch(LocalDate localdate) {
        ZoneId zoneId = ZoneId.systemDefault();
        return localdate.atStartOfDay(zoneId).toEpochSecond();
    }

    public static void getTripStartDate(Trip trip) {
        final long after = transferLocalDateToEpoch(trip.getStart());
    }

    public static void getTripFinishDate(Trip trip) {
        final long before = transferLocalDateToEpoch(trip.getFinish());
    }
}



