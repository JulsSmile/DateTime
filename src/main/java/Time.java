import org.joda.time.DateTime;

import org.joda.time.DateTimeZone;
import org.joda.time.LocalDate;


import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;

import java.time.ZoneId;
import java.time.ZonedDateTime;


public class Time{
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);
        LocalDateTime currentTime = LocalDateTime.now();


        String data = String.valueOf(currentDate);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime jodatime = dtf.parseDateTime(data);
        DateTimeFormatter dtfOut = DateTimeFormat.forPattern("MM/dd/yyyy");
        System.out.println(dtfOut.print(jodatime));
        DateTimeFormatter dateformatOut = DateTimeFormat.forPattern("dd-MM-yyyy");
        System.out.println(dateformatOut.print(jodatime));

//        LocalDateTime ldt = LocalDateTime.of(2014, 5, 29, 18, 41, 16);
//        ZonedDateTime zdt = ldt.atZone(ZoneId.of("America/Los_Angeles"));
//        System.out.println("ldt " + LocalDateTime.now().atZone(ZoneId.systemDefault()).toInstant().toEpochMilli());
//        System.out.println("ctm " + System.currentTimeMillis());
//        public DateTime toDateTimeAtStartOfDay(DateTimeZone);
//        System.out.println(dateStartDay.print(jodatime));
//        LocalDate.parse(stringDate, DATEFORMATTER).atStartOfDay(ZoneOffset.UTC).toInstant().toEpochMilli();


    }
}




