import org.joda.time.DateTime;

import org.joda.time.LocalDate;


import org.joda.time.LocalDateTime;
import org.joda.time.format.DateTimeFormat;
import org.joda.time.format.DateTimeFormatter;


public class Time{
    public static void main(String[] args) {

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate);


        String data = String.valueOf(currentDate);
        DateTimeFormatter dtf = DateTimeFormat.forPattern("yyyy-MM-dd");
        DateTime jodatime = dtf.parseDateTime(data);
        DateTimeFormatter dtfOut = DateTimeFormat.forPattern("MM/dd/yyyy");
        System.out.println(dtfOut.print(jodatime));
        DateTimeFormatter dateformatOut = DateTimeFormat.forPattern("dd-MM-yyyy");
        System.out.println(dateformatOut.print(jodatime));

        DateTimeFormatter dateTime = DateTimeFormat.longDateTime();
        System.out.println(dateTime.print(jodatime));
        }
    }




