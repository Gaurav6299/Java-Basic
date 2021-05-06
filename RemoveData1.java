import java.util.*;
class RemoveData1
{
public static void main(String args[])
{
ArrayList<String> l=new ArrayList<>();
l.add("Sujit");
l.add("gaurav");
l.add("kumar");
l.add("vikash");
System.out.println(l);
l.subList(0,3).clear();
System.out.println(l);
}
}