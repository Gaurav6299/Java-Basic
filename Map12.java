import java.util.*;
class Map12
{
public static void main(String args[])
{
Map<Integer,String> map=new HashMap<>();
map.put(1,"gaurav");
map.put(2,"kushal");
map.put(3,"kumar");
map.put(4,"vikash");

System.out.println(map);
for(Map.Entry<Integer,String> m:map.entrySet())
{
System.out.println(m.getKey()+" "+m.getValue());
}
Map<Integer,String> m1=new HashMap<>();

for(Map.Entry<Integer,String> m2:map.entrySet())
{
m1.put(m2.getKey(),m2.getValue());
}
System.out.println(m1);
}
}