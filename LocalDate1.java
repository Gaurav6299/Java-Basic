import java.time.*;
import java.time.temporal.*;
class LocalDate1
{
public static void main(String arg[])
{
LocalDate d=LocalDate.of(2020,2,23);
LocalTime t=LocalTime.of(7,45);
LocalDateTime dt=LocalDateTime.of(d,t);
System.out.println("LocalDateTime is:"+dt);
}
}