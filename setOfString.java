import java.util.*;
class setOfString
{
public static void main(String args[])
{
Set<String> set=new HashSet<>(Arrays.asList("gaurav","kushal","kumar","sujit"));
System.out.println("the String is:"+set);
String s=String.join(" ,",set);
System.out.println("Set of String is:"+s);
}
}