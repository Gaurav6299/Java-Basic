import java.util.*;
class AbstractList1
{
public static void main(String args[])
{
AbstractList<String> str=new ArrayList<>();
str.add("sujit");
str.add("kumar");
str.add("gaurav");
str.add("kushal");
System.out.println(str);
str.remove(2);
System.out.println(str);
}
}