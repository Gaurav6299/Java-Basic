import java.util.*;
class ListIterator2
{
public static void main(String args[])
{
ArrayList<String> l=new ArrayList<>();
l.add("kumar");
l.add("sujit");
l.add("kushal");
l.add("vikash");
System.out.println(l);

ListIterator li=l.listIterator();
while(li.hasNext())
{
String s=(String)li.next();
System.out.println(s);
}
}
}