import java.util.*;
import java.text.*;
class SimpleDate
{

static String convertDateToString(String date)
{
DateFormat df=new SimpleDateFormat(date);
Date today=Calendar.getInstance().getTime();
String s= df.format(today);
return s;
}

public static void main(String args[])
{
String date="2021-02-20";
System.out.println(convertDateToString(date));
}
}