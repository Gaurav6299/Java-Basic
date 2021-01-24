import java.util.*;
class ArrayString
{
static String[] convertArrayString(Set<String> s)
{
String k[]=s.toArray(new String[s.size()]);
return k;
}
public static void main(String args[])
{
Set<String> s=new HashSet<>(Arrays.asList("kumar","gaurav","sujit","kushal"));
String m[]=convertArrayString(s);
System.out.println(Arrays.toString(m));
}
}