import java.time.*;
class Instant2
{
public static void main(String args[])
{
Clock c=Clock.systemUTC();
Instant i=Instant.now(c);
System.out.println(i);

Clock c1=Clock.systemUTC();
Instant i1=Instant.now(c1);
System.out.println(i1);

Clock c2=Clock.systemUTC();
Instant i2=Instant.now(c2);
System.out.println(i2);
}
}
