import java.util.*;
import java.text.*;
class Date1
{
static void convertDateToString(String s)
{
DateFormat df=new SimpleDateFormat(s);
Date today=Calendar.getInstance().getTime();
System.out.println(today);
//return str;
}
public static void main(String args[])
{
String s="2020-02-21";
convertDateToString(s);
}
}