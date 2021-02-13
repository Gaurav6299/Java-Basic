import java.time.*;
class Time1
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("Asia/Kolkata");
Clock cl=Clock.tickMinutes(z);
System.out.println(cl.instant());
}
}