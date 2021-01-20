//Reverse a String using getBytes() method
import java.util.*;
class reverseString
{
public static void main(String args[])
{
String s="gaurav";
byte b[]=s.getBytes();
byte result[]=new byte[b.length];
for(int i=0;i<b.length;i++)
{
result[i]=b[b.length-i-1];
}
System.out.println(new String(result));
}
}