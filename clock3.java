import java.time.*;
class clock3
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("Asia/Tokyo");
Clock c=Clock.system(z);
Instant i=c.instant();
System.out.println(i);
ZonedDateTime zone=i.atZone(c.getZone());
System.out.println(zone);
}
}