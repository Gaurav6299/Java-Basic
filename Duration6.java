import java.time.*;
class Duration6
{
public static void main(String args[])
{
Duration d=Duration.parse("P2DT3H4M");
System.out.println(d);
System.out.println(d.toHours());

Duration d2=Duration.parse("P3DT4H2M");
System.out.println(d2);
System.out.println(d2.toHours());
}
}