import java.time.*;
class clock2
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("Asia/Kolkata");
Clock c=Clock.system(z);
System.out.println(c);
Instant i =c.instant();
System.out.println(i);

ZonedDateTime z2=i.atZone(c.getZone());
System.out.println(z2);

}
}
