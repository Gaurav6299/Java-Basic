import java.time.*;
class duration1
{
public static void main(String args[])
{
Duration d=Duration.parse("P2DT3H4M");

Duration d1=Duration.ofDays(10);
System.out.println(d.equals(d1));
}
}