import java.util.*;
class convertToByte
{
public static void main(String args[])
{
try
{
String s="Gaurav";
byte b[]=s.getBytes("US-ASCII");
System.out.print(Arrays.toString(b));
}
catch(Exception e)
{
System.out.println(e);
}


}
}