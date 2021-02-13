import java.time.*;
class clock5
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("Asia/Kolkata");
Clock c=Clock.tickSeconds(z);
System.out.println(c.instant());
}
}