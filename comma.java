//convert ArrayList to comma separated String in java
import java.util.*;
class comma
{
public static void main(String args[])
{
ArrayList<String> l=new ArrayList<>();
l.add("sujit");
l.add("kumar");
l.add("gaurav");
l.add("kushal");

String s=String.join(",",l);
System.out.println("String  is:"+s);
}
}