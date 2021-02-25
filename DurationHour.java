import java.time.*;
class DurationHour
{
public static void main(String args[])
{
Duration d=Duration.parse("P2DT4H20M");
System.out.println(d);
System.out.println(d.toHoursPart());
Duration d2=Duration.parse("P3DT5H6M");
System.out.println(d2.toHoursPart());

Duration d3=Duration.ofHours(10);
System.out.println(d3.toHoursPart());
Duration d4=Duration.parse("P2DT45H30M");
System.out.println(d4.toHoursPart());

Duration d5=Duration.parse("P4DT55H60M");
System.out.println(d5.toHoursPart());

}
}