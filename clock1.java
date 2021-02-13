import java.time.*;
class clock1
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("Asia/Tokyo");
Clock c=Clock.tickMinutes(z);
ZonedDateTime z1=c.instant().atZone(c.getZone());
System.out.println(z1.toString());

ZoneId z2=ZoneId.of("Asia/Kolkata");
Clock c1=c.withZone(z2);
ZonedDateTime d1=c1.instant().atZone(c1.getZone());

System.out.println(d1.toString());
}
}