import java.time.*;
class Zone1
{
public static void main(String args[])
{
Clock c=Clock.systemUTC();
ZonedDateTime t=c.instant().atZone(c.getZone());
System.out.println(t.toString());

ZoneId z=ZoneId.of("Asia/Tokyo");
Clock c2=c.withZone(z);
ZonedDateTime t2=c2.instant().atZone(c2.getZone());
System.out.println(t2);
}
}