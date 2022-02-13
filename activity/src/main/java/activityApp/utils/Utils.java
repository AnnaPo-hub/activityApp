package activityApp.utils;

import activityApp.domain.Trip;
import lombok.experimental.UtilityClass;

import java.time.LocalDate;
import java.time.ZoneId;

@UtilityClass
public class Utils {
    /** The method to transform localdate to the epoch timestamp that is required in Strava API
     *
     * @param localdate start or finish date of the trip
     * @return An epoch timestamp to use for filtering activities that have taken place after  or before a certain time
     */
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



