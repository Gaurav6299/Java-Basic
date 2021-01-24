//Convert set of String to String array using Stream
import java.util.*;
class convertArrayString
{
static String[] convertArray(Set<String> s)
{
String k[]=s.stream().toArray(String[]::new);
return k;
}
public static void main(String args[])
{
Set<String> s=new HashSet<>(Arrays.asList("sujit","kumar","gaurav"));
String y[]=convertArray(s);
System.out.println(Arrays.toString(y));
}
}