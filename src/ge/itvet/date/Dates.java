package ge.itvet.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.time.temporal.TemporalAccessor;
import java.util.Calendar;
import java.util.Date;

public class Dates {

    public static void testDate(){
        Date date;
        date = new Date();
        long time = date.getTime();
        System.out.println(date.getTimezoneOffset());
    }
    public static void testCalendar(){
        Calendar instance = Calendar.getInstance();
        instance.setTimeInMillis(Long.MIN_VALUE);
//        System.out.println(instance);
        System.out.println();
        instance.setTimeInMillis(Long.MAX_VALUE);
//        System.out.println(instance);


        String s1 = "23-08.2020 10:00";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-MM.yyyy HH:mm");
        try {
            Date parse = simpleDateFormat.parse(s1);
            System.out.println(parse);
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }

    public static void testTime(){
        String s = "2020-06-23T00:00:00";
        String s1 = "23-08.2020T10:00";

        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM.yyyy'T'HH:mm");
        System.out.println(LocalDateTime.parse(s1,dtf));
        LocalDateTime now = LocalDateTime.parse(s);
        System.out.println(now);
        LocalDateTime localDateTime = now.withHour(0);
        System.out.println(localDateTime);

    }
}
