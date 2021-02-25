import java.util.*;
class calendar1
{
public static void main(String args[])
{
Calendar c=new GregorianCalendar(2021,01,25);
int day=c.get(Calendar.DAY_OF_MONTH);
int month=c.get(Calendar.MONTH);
int year=c.get(Calendar.YEAR);
System.out.println("Day="+day);
System.out.println("Month="+month);
System.out.println("Year="+year);
}
}