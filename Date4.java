import java.util.*;
import java.text.*;
class Date4
{
static void findDifference(String sDate,String eDate)
{
SimpleDateFormat df=new SimpleDateFormat("dd-mm-yyyy HH-mm-ss");
try
{
Date d1=df.parse(sDate);
Date d2=df.parse(eDate);

long timeDiff=d2.getTime()-d1.getTime();
System.out.println(timeDiff);

long diffInSec=(timeDiff/1000)%60;
long diffInMin=(timeDiff/(1000*60))%60;
long diffInHour=(timeDiff/(1000*60*60))%24;
long diffInYear=(timeDiff/(1000l*60*60*24*365));
long diffInDay=(timeDiff/(1000*60*60*24))%365;

System.out.println("Year="+diffInYear);
System.out.println("Hours="+diffInHour);
System.out.println("Minutes="+diffInMin);
System.out.println("Sec="+diffInSec);
System.out.println("Days="+diffInDay);

}
catch(Exception e)
{
e.printStackTrace();
}

}
public static void main(String args[])
{
String sDate="2019-02-21 01-10-30";
String eDate="2021-02-21 02-15-20";
findDifference(sDate,eDate);
}
}