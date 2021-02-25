import java.util.*;
import java.time.*;
class FindDate1
{
static void Day(String s)
{
LocalDate l=LocalDate.parse(s);
int day=l.getDayOfMonth();
System.out.println(day);

Month month=l.getMonth();
System.out.println(month);
}
public static void main(String args[])
{
String s="2020-02-21";
Day(s);
}
}