import java.util.*;
class Reversse
{
public static void main(String args[])
{
List<String> l=new ArrayList();
l.add("sujit");
l.add("kumar");
l.add("kushal");
l.add("water");
System.out.println(l);
Collections.reverse(l);
System.out.println(l);

Integer a[]={10,20,30,40,50};
System.out.println(Arrays.toString(a));
Collections.reverse(Arrays.asList(a));
System.out.println(Arrays.toString(a));
}
}