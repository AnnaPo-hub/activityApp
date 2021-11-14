package activityApp.utils;

import java.time.LocalDate;
import java.time.ZoneId;

public class Utils {

    public static void getAllActivityForGivenTrip(LocalDate start, LocalDate  finish) {
//берутся  даты старт и финиш из БД

    }


    public static long transferLocalDateToEpoch(LocalDate localdate) {
        ZoneId zoneId = ZoneId.systemDefault();
        return localdate.atStartOfDay(zoneId).toEpochSecond();
    }
}



