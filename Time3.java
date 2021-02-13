import java.time.*;
class Time3
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("Asia/Tokyo");
Clock c=Clock.tickMinutes(z);
ZonedDateTime t=c.instant().atZone(c.getZone());
System.out.println(t);
}
}
