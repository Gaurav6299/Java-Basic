import java.util.*;
class SubList1
{
public static void main(String args[])
{
try
{
ArrayList<String> l=new ArrayList<>();
l.add("sujit");
l.add("kumar");
l.add("kushal");
l.add("gaurav");
System.out.println(l);
List<String> l1=l.subList(1,3);
System.out.println(l1);
}

catch(IndexOutOfBoundsException e)
{
System.out.println(e);
}

catch(IllegalArgumentException e)
{
System.out.println(e);
}

}
}