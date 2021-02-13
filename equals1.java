import java.time.*;
class equals1
{
public static void main(String args[])
{
ZoneId z=ZoneId.of("Asia/Tokyo");
Clock c=Clock.system(z);
ZonedDateTime z1=c.instant().atZone(c.getZone());
System.out.println(z1.toString());

Clock c2=Clock.systemDefaultZone();
ZonedDateTime z2=c2.instant().atZone(c2.getZone());
System.out.println(z2.toString());

boolean res=c.equals(c2);
System.out.println("Is it equals:"+res);

}
}