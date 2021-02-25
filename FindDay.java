import java.time.*;
class FindDay
{
static void Day(String date)
{
LocalDate l=LocalDate.parse(date);
int day=l.getDayOfMonth();
System.out.println("Day is:"+day);
Month month = l.getMonth();
System.out.println("Month is:"+month);
int year=l.getYear();
System.out.println("Year is:"+year);
}
public static void main(String args[])
{
String date="2021-02-20";
Day(date);
}
}