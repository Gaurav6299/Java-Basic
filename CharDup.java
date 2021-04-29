import java.util.*;
class CharDup
{
static void FindChar(String s)
{
List<Character> l=new ArrayList<>();
List<Character> l1=new ArrayList<>();
char c[]=s.toCharArray();
for(int i=0;i<c.length;i++)
{
if(!l.contains(c[i]))
{
l.add(c[i]);
}
else
{
l1.add(c[i]);
}
}
System.out.println("Duplicate Character is:"+l1 );
}
public static void main(String args[])
{
String s="gauravvg";
FindChar(s);
}
}