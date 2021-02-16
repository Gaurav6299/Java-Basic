import java.time.*;
class Second1
{
public static void main(String args[])
{
Duration d=Duration.ofSeconds(2345);
System.out.println(d);
System.out.println(d.getSeconds());
}
}