import java.util.*;
class RandomData1
{
static String random(List<String> l)
{
Random r=new Random();
return l.get(r.nextInt(l.size()));
}
public static void main(String args[])
{
List<String> l=new ArrayList<>();
l.add("gaurav");
l.add("sujit");
l.add("kumar");
l.add("payal");
System.out.println(l);
System.out.println(random(l));

}
}