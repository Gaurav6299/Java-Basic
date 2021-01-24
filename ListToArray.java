import java.util.*;
class ListToArray
{
static String[] convertArray(ArrayList<String> l)
{
String s[]=l.toArray(new String[0]);
return s;
}
public static void main(String args[])
{
ArrayList<String> l=new ArrayList<>();
l.add("hello");
l.add("gaurav");
l.add("kumar");
l.add("sujit");
String h[]=convertArray(l);
System.out.println(Arrays.toString(h));
}
}