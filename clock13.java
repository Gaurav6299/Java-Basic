import java.time.*;
class clock13
{
public static void main(String args[])
{
Clock c1=Clock.systemUTC();
Instant i=Instant.now(c1);
System.out.println(i);
}
}