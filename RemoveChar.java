import java.util.*;
class RemoveChar
{
static String remove(String s)
{
Set<Character> set=new HashSet<>();
char a[]=s.toCharArray();
String k="";
for(int i=0;i<a.length;i++)
{
if(!(set.contains(a[i])))
{
set.add(i,a[i]);
}
}
System.out.println(set);
for(char l:set)
{
k+=l;
}
return k;
}
public static void main(String args[])
{
String s="Gaurav";
System.out.println(remove(s));
}
}