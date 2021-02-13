import java.time.*;
class Zone2
{
public static void main(String args[])
{
ZoneId z1=ZoneId.of("Asia/Kolkata");
Clock c=Clock.tickMinutes(z1);
System.out.println(c);
ZonedDateTime t=c.instant().atZone(c.getZone());
System.out.println(t.toString());

ZoneId z=ZoneId.of("America/Chicago");
Clock c1=c.withZone(z);
ZonedDateTime t1=c1.instant().atZone(c1.getZone());
System.out.println(t1.toString());
}
}