import java.util.*;
class Map13
{
public static void main(String args[])
{
String s="kumarr";
char c[]=s.toCharArray();
Map<Character,Integer> m=new HashMap<>();
for(int i=0;i<c.length;i++)
{
m.put(c[i], m.getOrDefault(c[i],0)+1);
}
System.out.println(m);
for(Character i:m.keySet())
{
if(m.get(i)==1)
{
System.out.println(i);
}
}
}
}