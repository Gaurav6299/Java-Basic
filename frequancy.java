import java.util.*;
class  frequancy
{
public static void main(String args[])
{
List<String> l=new ArrayList<>();
l.add("gaurav");
l.add("kumar");
l.add("sujit");
l.add("sujit");
System.out.println(Collections.frequency(l,"sujit"));
}
}