import java.util.*;
class convertArray
{
public static void main(String args[])
{
Set<String> s=new HashSet<>();
s.add("kumar");
s.add("kushal");
s.add("sujit");
System.out.println("the set is:"+s);
String str[]=new String[s.size()];
int i=0;
for(String k:s)
{
str[i]=k;
i++;
}
System.out.println(Arrays.toString(str));
}
}