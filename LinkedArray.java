import java.util.*;
class LinkedArray
{
public static void main(String args[])
{
String s[]={"gaurav","ankit","sujit","kumar","gaurav"};
LinkedHashSet<String> s1=new LinkedHashSet<>(Arrays.asList(s));
System.out.println("Linked Hash Set is:"+s1);
}
}