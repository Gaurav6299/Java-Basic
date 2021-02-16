import java.util.*;
class common
{
public static void main(String args[])
{
Set<String> s=new HashSet<>();
s.add("gaurav");
s.add("kushal");
s.add("kunal");
Set<String> s1=new HashSet<>();
s1.add("gaurav");
s1.add("kunal");
s1.add("Ankit");

//common element is
s.retainAll(s1);
System.out.println("the element is:"+s);

}
}
