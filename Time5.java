import java.time.*;
class Time5
{
public static void main(String args[])
{
Clock c=Clock.systemUTC();
System.out.println(c);
ZonedDateTime t=c.instant().atZone(c.getZone());
System.out.println(t);

ZoneId z=ZoneId.of("Asia/Kolkata");
Clock base=c.withZone(z);
ZonedDateTime t1=base.instant().atZone(base.getZone());
System.out.println(t1.toString());
}
}