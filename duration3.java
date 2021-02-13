import java.time.*;
class duration3
{
public static void main(String args[])
{
Duration d=Duration.ofHours(10);
System.out.println(d);

Duration d2=Duration.ofHours(10);
System.out.println(d2);
System.out.println(d.equals(d2));
}
}