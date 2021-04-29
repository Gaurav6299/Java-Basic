import java.util.*;
class Unique
{
public static void main(String args[])
{
String s="Morning";
Set<Character> set=new HashSet<>();
char c[]=s.toCharArray();
for(int i=0;i<c.length;i++)
{
set.add(c[i]);
}
System.out.println(set);
}
}