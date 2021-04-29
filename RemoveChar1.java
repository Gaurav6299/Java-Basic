import java.util.*;
class RemoveChar1
{
public static void main(String args[])
{
Set<Character> set=new LinkedHashSet<>();
String s="Gaurav";
String k="";
char c[]=s.toCharArray();
System.out.println(Arrays.toString(c));
for(int i=0;i<c.length;i++)
{
set.add(c[i]);
}
for(char c1:set)
{
k+=c1;
}
System.out.println(k);
}

}