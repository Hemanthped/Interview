import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class Dates {
    public static void main(String[] args) {
        LocalDate ld = LocalDate.now();
        LocalDate ld1 = LocalDate.of(2021,11,24);
        LocalDate ld2 = LocalDate.parse("2024-11-24");
       // System.out.println(ld+" "+ld1+ " "+ld2);

        LocalTime lt = LocalTime.now();
        LocalTime lt1 = LocalTime.parse("06:57:45");
        //System.out.println(lt+" "+lt1);

        LocalDateTime ltd = LocalDateTime.now();
        LocalDateTime ltd1 = ltd.minusWeeks(5);
        //System.out.println(ltd1);

        ZonedDateTime zdt = ZonedDateTime.now();
        System.out.println(zdt);
        for(String zone: ZoneId.getAvailableZoneIds()){
            System.out.println(zone);
        }
    }
}
