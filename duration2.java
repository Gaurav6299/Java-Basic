import java.time.*;
class duration2
{
public static void main(String args[])
{
Duration d=Duration.ofHours(5);
System.out.println(d);

Duration d2=Duration.ofHours(6);
System.out.println(d2);

System.out.println(d.equals(d2));
}
}