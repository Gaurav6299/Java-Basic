import java.util.*;
class Map14
{
public static void main(String args[])
{
Map<String,Integer> m=new HashMap<>();
m.put("gaurav",1);
m.put("kushal",2);
m.put("kumar",3);
m.put("vishal",4);
System.out.println(m);

for(String s:m.keySet())
{
if(m.get(s)==1)
{
System.out.println(s);
}
}
for(Map.Entry<String,Integer> m1:m.entrySet())
{
System.out.println(m1.getKey()+" "+m1.getValue());
}
}
}