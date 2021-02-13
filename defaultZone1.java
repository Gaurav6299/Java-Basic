import java.time.*;
class defaultZone1
{
public static void main(String args[])
{
Clock c=Clock.systemDefaultZone();
Instant i=c.instant();
ZonedDateTime z=i.atZone(c.getZone());
System.out.println(z.toString());
}
}