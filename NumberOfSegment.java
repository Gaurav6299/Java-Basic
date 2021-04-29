//count the number of segment in a string;
import java.util.*;
class NumberOfSegment
{
static int countSegment(String s)
{
if(s==null || s.trim().length()==0)
return 0;

String str[]=s.trim().split("\\s+");
System.out.println(Arrays.toString(str));
return str.length;
}
public static void main(String args[])
{
String s="  hello kumar, how are you";
System.out.println(countSegment(s));
}
}
