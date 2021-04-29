import java.util.*;
class DisJoint
{
public static void main(String args[])
{
List<String> l=new ArrayList<>();
l.add("sujit");
l.add("kushal");
l.add("kumar");

List<String> l1=new Vector<>();
l1.add("vikash");
l1.add("mukesh");
l1.add("babu");
l1.add("sujit");

System.out.println(Collections.disjoint(l,l1));

Set<String> set=new HashSet<>();
set.add("gaurav");
set.add("kushal");
set.add("payal");

System.out.println(Collections.disjoint(l,set));
}
}