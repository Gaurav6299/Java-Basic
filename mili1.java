import java.time.*;
class mili1
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("Asia/Tokyo");
Clock c=Clock.system(z);
long miliSeconds =c.millis();
System.out.println("The time is:"+miliSeconds);
}
}