import java.util.*;
class compareString
{
public static void main(String args[])
{
String s="gaurav";
String s1="Gaurav";
System.out.println(s.equals(s1));
System.out.println(s.equalsIgnoreCase(s1));

String k=new String("sujit");
String l=new String("sujit");
System.out.println(Objects.equals(k,l));
}
}