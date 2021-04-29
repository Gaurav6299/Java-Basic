import java.util.*;
class Shuffle2
{
public static void main(String args[])
{
List<String> l=new ArrayList<>();
l.add("garav");
l.add("kumar");
l.add("sujit");
l.add("kushal");
System.out.println(l);
Collections.shuffle(l);
System.out.println(l);

}
}