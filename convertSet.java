import java.util.*;
class convertSet
{
static Set<String> convertArrayToSet(String s[])
{
Set<String> set=new HashSet<>();
for(int i=0;i<s.length;i++)
{
set.add(s[i]);
}
return set;
}
public static void main(String args[])
{
String a[]={"sujit","kumar","gaurav","kushal"};
Set<String> k=convertArrayToSet(a);
System.out.println("Set is:"+k);
k.remove("kushal");
System.out.println(k);
}
}