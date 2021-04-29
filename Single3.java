import java.util.*;
class Single3
{
public static void main(String args[])
{
List<String> l=new ArrayList<>();
l.add("sujit");
l.add("kumar");
l.add("kushal");
l.add("kushal");
l.add("kushal");
System.out.println(l);
l.removeAll(Collections.singleton("kushal"));
System.out.println(l);
}
}