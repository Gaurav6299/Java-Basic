import java.util.*;
class convertByte
{
public static void main(String args[])
{
try
{
String s="gaurav";
byte b[]=s.getBytes("US-ASCII");
System.out.println(Arrays.toString(b));
}
catch(Exception e)
{
System.out.println(e);
}

}
}