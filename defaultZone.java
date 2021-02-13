import java.time.*;
class defaultZone
{
public static void main(String args[])
{
Clock c=Clock.systemDefaultZone();
Instant i=c.instant();
ZonedDateTime d=i.atZone(c.getZone());
System.out.println(d.toString());
}
}