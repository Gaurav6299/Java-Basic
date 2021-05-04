import java.util.*;
class ListStr
{
public static void main(String args[])
{
List<String> l=new ArrayList<>();
l.add("kushaml");
l.add("kumar");
l.add("sujit");
l.add("gaurav");

Iterator i=l.iterator();
while(i.hasNext())
{
System.out.println(i.next());
}

for(String s:l)
{
System.out.print(s+" ");
}
}
}