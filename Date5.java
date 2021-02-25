import java.util.*;
import java.time.*;
class Date5
{
public static void main(String args[])
{
LocalDate l=LocalDate.of(2021,03,26);
System.out.println(l);
System.out.println(l.getDayOfMonth());
System.out.println(l.getMonth());
System.out.println(l.getYear());
}
}