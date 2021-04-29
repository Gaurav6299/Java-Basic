import java.util.*;
class Abstract4
{
public static void main(String args[])
{
AbstractCollection<String> a=new TreeSet<>();
a.add("sujit");
a.add("gaurav");
a.add("kumar");
a.add("ksuhal");

System.out.println(a);

AbstractCollection<String> a1=new TreeSet<>();

a1.addAll(a);
System.out.println(a1);
}

}