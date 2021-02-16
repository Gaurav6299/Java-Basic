import java.time.*;
class Second
{
public static void main(String args[])
{
Duration d=Duration.ofSeconds(2123);
System.out.println(d);
System.out.println(d.getSeconds());
}
}