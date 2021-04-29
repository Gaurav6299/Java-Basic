import java.util.*;
class ListSwap1
{
public static void main(String args[])
{
ArrayList<String> l=new ArrayList<>();
l.add("sujit");
l.add("kumar");
l.add("kushal");
l.add("gaurav");
System.out.println(l);
Collections.swap(l,1,3);
System.out.println(l);
Collections.swap(l,0,2);
System.out.println(l);

Collections.swap(l,0,3);

System.out.println(l);
}
}