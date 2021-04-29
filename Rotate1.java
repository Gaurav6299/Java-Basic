import java.util.*;
class Rotate1
{
public static void main(String args[])
{
List<String> l=new ArrayList<>();
l.add("kumar");
l.add("sujit");
l.add("gaurav");
System.out.println(l);
Collections.rotate(l,1);
System.out.println(l);
}
}