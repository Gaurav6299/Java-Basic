import java.time.*;
class zone4
{
public static void main(String args[])
{
Clock c=Clock.systemUTC();
Instant i=c.instant();
ZonedDateTime d=i.atZone(c.getZone());
System.out.println(d.toString());
}
}