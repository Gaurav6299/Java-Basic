import java.time.*;
class clock4
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("US/Arizona");
Clock c=Clock.system(z);
Instant i=c.instant();
ZonedDateTime zone=i.atZone(c.getZone());
System.out.println(zone);
}
}
