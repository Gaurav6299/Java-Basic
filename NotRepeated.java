import java.util.*;
class NotRepeated
{
public static void main(String args[])
{
String s="gaurav";
char c[]=s.toCharArray();
Map<Character,Integer> map=new HashMap<>();
for(int i=0;i<c.length;i++)
{
map.put(c[i],map.getOrDefault(c[i],0)+1);
}

System.out.println("Map is:"+map);
}
}
