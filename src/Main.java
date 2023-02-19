import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
//        Date date = new Date();
//
//        LocalDate localDate = LocalDate.now();
//        LocalDateTime localDateTime = LocalDateTime.now();
//        LocalTime localTime = LocalTime.now();
//
//        System.out.println(date);
//        System.out.println(localDate);
//        System.out.println(localDateTime);
//        System.out.println(localTime);


        LocalDateTime localDate1 = LocalDateTime.of(2007, Month.APRIL,20,4,23,24);
        System.out.println(localDate1);
    }
}

