import java.time.*;
class mili
{
public static void main(String args[])
{
Clock c=Clock.systemDefaultZone();
long miliSecond=c.millis();
System.out.println("The miliseconds is:"+miliSecond);
}
}