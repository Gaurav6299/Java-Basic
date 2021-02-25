import java.time.*;
import java.time.temporal.*;
class Date12
{
public static void main(String args[])
{
LocalDate d=LocalDate.of(2020,2,23);
LocalTime t=LocalTime.of(6,30);
LocalDateTime dt=LocalDateTime.of(d,t);
System.out.println(dt);
}
}