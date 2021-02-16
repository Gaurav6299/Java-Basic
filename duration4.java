import java.time.*;
class duration4
{
public static void main(String args[])
{
Duration d=Duration.parse("P3DT5H4M");
System.out.println("Duration is:"+d);
System.out.println("Number of hours is:"+d.toHours());
}
}
