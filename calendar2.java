import java.util.*;
import java.time.*;
class calendar2
{
static void findDate(String s)
{
String a[]=s.split("-");
String year=a[0];
String month=a[1];
String day=a[2];
System.out.println("Day="+day);
System.out.println("Year="+year);
System.out.println("Month="+month);
}
public static void main(String args[])
{
String s="2021-02-23";
findDate(s);
}
}