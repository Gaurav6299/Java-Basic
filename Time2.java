import java.time.*;
class Time2
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("Europe/Paris");
System.out.println(z);
Clock c=Clock.tickMinutes(z);
System.out.println(c.instant());
}
}
