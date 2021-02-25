import java.util.*;
import java.text.*;
import java.time.*;
class Date3
{
static void ConvertToString(String s)
{
LocalDate l=LocalDate.parse(s);
System.out.println(l);
int day=l.getDayOfMonth();
System.out.println("Day is:"+day);
Month m=l.getMonth();
System.out.println("Month="+m);
int year=l.getYear();
System.out.println("Year="+year);
}
public static void main(String args[])
{
String s="2021-02-21";
ConvertToString(s);
}
}