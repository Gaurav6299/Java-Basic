import java.util.*;
class abstract3
{
public static void main(String args[])
{
AbstractCollection<Object> a=new ArrayList<>();
a.add("sujit");
a.add(10);
a.add("gaurav");
a.add("kumar");
a.add("kushal");
System.out.println(a);

AbstractCollection<String> a1=new ArrayList<>();
a1.add("NIT");
a1.add("GITA");
a1.add("GIT");
a1.add("KIIT");
System.out.println(a1);
System.out.println(a1.size());

AbstractCollection<Integer> a3=new TreeSet<>();
a3.add(1);
a3.add(2);
a3.add(4);
a3.add(5);
System.out.println(a3);
}
}