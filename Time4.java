import java.time.*;
class Time4
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("Asia/Karachi");
Clock c=Clock.tickMinutes(z);
ZonedDateTime t=c.instant().atZone(c.getZone());
System.out.println(t.toString());
}
}
