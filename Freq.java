import java.util.*;
class Freq
{
public static void main(String args[])
{
List<String> l=new ArrayList<>();
l.add("sujit");
l.add("gaurav");
l.add("kumar");
l.add("kumar");

System.out.println(Collections.frequency(l,"kumar"));
}
}