import java.util.*;
class AbstractList2
{
public static void main(String args[])
{
AbstractList<String> ab=new LinkedList<>();
ab.add("kumar");
ab.add("sujit");
ab.add("kushal");
ab.add("vikash");
System.out.println(ab);
int index=ab.lastIndexOf("vikash");
System.out.println(index);
}
}