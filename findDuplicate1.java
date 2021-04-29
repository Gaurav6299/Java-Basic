import java.util.*;
class findDuplicate1
{
public static void main(String args[])
{
String s="Gaurav";
List<Character> l=new ArrayList<>();
char c[]=s.toCharArray();
for(int i=0;i<c.length;i++)
{
if(!l.contains(c[i]))
{
l.add(c[i]);
}
}

System.out.println(Arrays.toString(c));
}
}