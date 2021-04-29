import java.util.*;
class Singleton
{
public static void main(String args[])
{
List<String> l=new ArrayList<>();
l.add("sujit");
l.add("kumar");
l.add("sujit");
l.add("gaurav");
l.removeAll(Collections.singleton("sujit"));
System.out.println(l);
}
}